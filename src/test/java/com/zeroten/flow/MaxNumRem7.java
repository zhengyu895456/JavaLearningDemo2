package com.zeroten.flow;

import org.testng.annotations.Test;

public class MaxNumRem7 {
    int getMaxNumRem7(int n1, int n2){
        for(int n = n2; n >= 0; n--){
            if (n % n1 == 7){
                return n;
            }
        }
        return -1;
    }
    @Test
    public void testReturn(){
        int r1 = getMaxNumRem7(10,1000);
        System.out.println(r1);
    }
    @Test
    public void testContinue(){
        int total = 0;
        for (int n = 0; n < 100; n++){
            if (n % 7 != 0){
                continue;
            }
            System.out.println(n + "能被7整除");
            total++;
        }
        System.out.println("0到100之间有" + total + "个能被7整除的数");
    }
}

