package com.zeroten.flow;

import org.testng.annotations.Test;

import java.nio.file.FileSystemNotFoundException;

public class SwitchTest {
    @Test
    public void testSwitch1(){
        switch(1){
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
                break;
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }
    }
    @Test
    public void testSwitch2(){
        int n = 3;
        switch (n) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            default:
                System.out.println(0);
        }
    }
}
