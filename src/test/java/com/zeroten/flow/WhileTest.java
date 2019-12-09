package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class WhileTest {
    @Test
    public void testWhile(){
        boolean isContinue = true;
        int times = 0;
        while (isContinue){
            int r = new Random().nextInt(1000);
            if (r % 30 == 0){
                isContinue = false;
                System.out.println(r + "能被30整除，退出");
            }else{
                System.out.println(r + "不能被30整除，继续");
                times++;
            }
        }
        System.out.println("随机产生了" + times + "个数");
    }
    @Test
    public void testBreak(){
        int times = 0;
        while(true){
            int r = new Random().nextInt(1000);
            if(r % 30 == 0){
                System.out.println(r + "能被30整除，退出");
                break;
            }else{
                System.out.println(r + "不能被30整除，继续");
                times++;
            }
        }
        System.out.println("随机产生了" + times + "个不能被30整除的数");
    }
}
