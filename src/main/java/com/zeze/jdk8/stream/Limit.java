package com.zeze.jdk8.stream;

import java.util.Random;

public class Limit {
    public static void main(String[] args) {
        //limit
        //limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
