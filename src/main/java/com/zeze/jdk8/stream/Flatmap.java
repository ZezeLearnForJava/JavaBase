package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args) {

        // flatmap 就是将String 拍平
        // flatmap 作用就是将元素拍平拍扁 ，将拍扁的元素重新组成Stream，并将这些Stream 串行合并成一条Stream
        Stream.of("a-b-c", "c-d-f")
                .flatMap(e -> Stream.of(e.split("-")))
                .forEach(System.out::println);
    }
}