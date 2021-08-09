package com.zeze.jdk8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAny {
    public static void main(String[] args) {
        Optional<String> stringOptional = Stream.of("apple", "banana", "orange", "waltermaleon", "grape")
                .parallel()
                .findAny(); //在并行流下每次返回的结果可能一样也可能不一样
        stringOptional.ifPresent(e -> System.out.println(e));
    }
}

