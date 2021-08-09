package com.zeze.jdk8.stream;

import java.util.stream.Stream;

public class Map2 {

    public static void main(String[] args) {
        // 当然也可以这样，这里使用了成员函数引用，为了便于读者们理解，后续的例子中将使用lambda表达式而非函数引用。
        Stream.of("apple","banana","orange","waltermaleon","grape")
                .map(String::length) //转成单词的长度 int
                .forEach(System.out::println);
    }
}