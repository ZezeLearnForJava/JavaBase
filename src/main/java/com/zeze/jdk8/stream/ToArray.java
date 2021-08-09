package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class ToArray {
    public static void main(String[] args) {

        // toArray转为数组
        Object[] objects= Stream.of(0,2,6,5,4,9,8,-1)
                .toArray();

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}