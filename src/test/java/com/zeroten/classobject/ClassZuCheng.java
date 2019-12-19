package com.zeroten.classobject;

import org.testng.annotations.Test;

public class ClassZuCheng {
    //类变量、静态域变量
    private static String count;
    //实例变量，域变量
    private String name;
    {
        //示例代码块，也可以称为初始化代码块
        System.out.println("类里、方法之外用大括号括起来的一段代码");
    }
    static{
        //静态代码块，也可以称为静态初始化代码块
        System.out.println("类里、方法外使用大括号括起来并且用static修饰的代码块");
    }
    //构造方法
    public ClassZuCheng(){}
    //方法
    public void println(){
        {
            System.out.println("代码块");
        }
    }
    //静态方法
    public static void staticPrintln(){}
    //内部类
    class InnerClass{}

}
