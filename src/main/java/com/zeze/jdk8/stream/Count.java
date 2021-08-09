package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        long count = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .count();

        System.out.println(count);
    }
}
