package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class MapToInt {
    public static void main(String[] args) {
        //mapToInt 将数据流中得元素转成Int，这限定了转换的类型Int，最终产生的流为IntStream，及结果只能转化成int。
        Stream.of("abc", "ccc")
                .mapToInt(str -> str.length())
                .forEach(System.out::println);
    }
}
