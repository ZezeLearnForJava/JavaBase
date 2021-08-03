package com.zeze.reflex;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TestMethod {
    public static void main(String[] args) throws Exception {

        final Map<String, String> stringStringMap = Collections.singletonMap("123", "123");
        readAttributeValue("test");
    }

    /**
     * 得到属性值
     * @param obj
     */
    public static void readAttributeValue(Object obj){
        String nameVlues="";
        //得到class
        Class cls = obj.getClass();
        //得到所有属性
        Field[] fields = cls.getDeclaredFields();
        for (int i=0;i<fields.length;i++){//遍历
            try {
                //得到属性
                Field field = fields[i];
                //打开私有访问
                field.setAccessible(true);
                //获取属性
                String name = field.getName();
                //获取属性值
                Object value = field.get(obj);
                //一个个赋值
                nameVlues += field.getName()+":"+value+",";
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //获取最后一个逗号的位置　　　　　　　
         int lastIndex = nameVlues.lastIndexOf(",");
        //不要最后一个逗号"
        String  result= nameVlues.substring(0,lastIndex);
        System.out.println(result);
    }
}
