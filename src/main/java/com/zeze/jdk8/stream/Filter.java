package com.zeze.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();

        System.out.println(count);


        Stream.of(1,2,3,1,2,5,6,7,8,0,0,1,2,3,1)
                .filter(e -> e >= 5) //过滤小于5的
                .forEach(e -> System.out.println(e));
    }
}
