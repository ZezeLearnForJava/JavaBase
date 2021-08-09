package com.zeze.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {
    public static void main(String[] args) {
        Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .collect(Collectors.toSet()) //set 容器
                .forEach(System.out::println);
    }
}
