package com.zeze.jdk8.stream;

import java.util.Comparator;
import java.util.Random;

public class Sort {
    //orted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
