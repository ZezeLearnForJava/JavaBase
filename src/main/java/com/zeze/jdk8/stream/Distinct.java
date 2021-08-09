package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream.of(1,2,3,1,2,5,6,7,8,0,0,1,2,3,1)
                .distinct() //去重
                .forEach(e->System.out.println(e));
    }
}