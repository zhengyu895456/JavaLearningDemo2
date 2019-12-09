package com.zeroten.flow;

import org.testng.annotations.Test;

public class ForTest {
    @Test
    public void testFor(){
        int total = 0;
        for (int n = 0; n <= 100; n++){
            if (n % 2 != 0){
                System.out.println(n + "是一个单数");
                ++total;
            }
        }
        System.out.println("0~100范围内有" + total + "个单数");
    }
}
