package com.zeroten.innerclass;

public class PrintClass {
    protected String name;
    public PrintClass(String name){
        this.name = name;
        System.out.println("调用了父类构造器name =" + this.name);
    }
    public void print(){
        System.out.println("我是打印");
    }
}
