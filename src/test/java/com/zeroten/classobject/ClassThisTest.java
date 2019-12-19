package com.zeroten.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {
    private int index;
    public ClassThisTest(){}
    public void println(String name){
        System.out.println(index + ". hello," + name);
    }
    public void printInt(int... nums){
        if (nums == null){
            System.out.println("is null");
            return;
        }
        if (nums.length == 0){
            System.out.println("Param length is zero.");
            return;
        }
        System.out.println("打印传入的可变参数。。。");
        for(int n = 0; n < nums.length; n++){
            System.out.println(nums[n]);
        }
    }
    @Test
    public void test1(){
        ClassThisTest obj = new ClassThisTest();
        obj.println("wendy");
    }
    @Test
    public void testPrintParam(){
        printInt(null);
        printInt(1);
        printInt(2,3,4,5);
    }
}
