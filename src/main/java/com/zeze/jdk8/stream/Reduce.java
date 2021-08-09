package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        //reduce 是一个规约操作，所有的元素归约成一个，比如对所有元素求和，乘啊等。
        int sum = Stream.of(0, 9, 8, 4, 5, 6, -1)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

}
