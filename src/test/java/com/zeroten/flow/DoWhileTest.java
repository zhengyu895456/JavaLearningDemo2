package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class DoWhileTest {
    @Test
    public void testDoWhile(){
        boolean isContinue = true;
        int times = 0;
        do{
            int r = new Random().nextInt(1000);
            if (r % 30 == 0){
                isContinue = false;
                System.out.println(r + "能被30整除，退出");
            }else{
                System.out.println(r + "不能被30整除，继续");
                times += 1;
            }
        }while(isContinue);
        System.out.println("随机产生了" + times + "个数");
    }
}
