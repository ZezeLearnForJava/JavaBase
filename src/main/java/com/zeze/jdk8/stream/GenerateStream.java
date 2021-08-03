package com.zeze.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateStream {

    public static void main(String[] args) {
        //stream() − 为集合创建串行流。
        //parallelStream() − 为集合创建并行流。
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }
}
