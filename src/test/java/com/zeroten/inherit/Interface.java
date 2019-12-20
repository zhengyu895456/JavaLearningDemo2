package com.zeroten.inherit;

public interface Interface {
    class InnerClass{}

    interface InnerInterface{}

    int MAX_COUNT = 100;

    void method();

    default void print(){
        System.out.println("我是一个默认方法");
    }
    static void print0(){
        System.out.println("我是接口中Java8才有的静态方法");
    }
}
