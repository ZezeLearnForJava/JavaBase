package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Skip {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .skip(4) //跳过前四个
                .forEach(System.out::println); //输出的结果应该只有5，6，7，8，9
    }
}
