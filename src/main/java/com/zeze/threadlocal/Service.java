package com.zeze.threadlocal;

public class Service {
    public static ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
    public String test() {

        return stringThreadLocal.get();
    }

}
