package com.zeroten.flow;

import org.testng.annotations.Test;

public class IfElseTest {

    @Test
    public void testIfElse() {
        int age = 10;
        if (age < 6){
            System.out.println(age + "岁，属于儿童");
        }else if (age < 18){
            System.out.println(age + "岁，属于少年");
        }else if (age < 41){
            System.out.println(age + "岁，属于青年");
        }else if (age < 60){
            System.out.println(age + "岁，属于中年");
        }else{
            System.out.println(age + "岁，属于老年");
        }
    }
}
