package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class NoneMatch {
    // noneMatch 数据流中得没有一个元素与条件匹配的
    public static void main(String[] args) {
        boolean result = Stream.of("aa", "bb", "cc", "aa")
                .noneMatch(e -> e.equals("aa"));
        System.out.println(result);
        //这里 的作用是是判断数据流中 一个都没有与aa 相等元素 ，但是流中存在 aa ，所以最终结果应该是false

        //allMatch和anyMatch 一个是全匹配，一个是任意匹配 和noneMatch 类似，这里就不在举例了。
    }
}
