package com.zeze.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
    }
}
