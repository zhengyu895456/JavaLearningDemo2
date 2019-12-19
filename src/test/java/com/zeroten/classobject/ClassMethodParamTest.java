package com.zeroten.classobject;

import org.testng.annotations.Test;

public class ClassMethodParamTest {
    private void changePrimitive(int num){
        System.out.println("传入：" + num);
        num = 20;
        System.out.println("修改后：" + num);
    }
    private void changeReference(StringBuilder sb){
        System.out.println("传入：" + sb.toString());
        sb.append("-追加");
        System.out.println("修改后：" + sb.toString());
        sb = new StringBuilder();
        sb.append("新字符串");
    }
    @Test
    public void testModifyMethodParam(){
        int num = 10;
        changePrimitive(num);
        System.out.println("num = " + num);
        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println("sb=" + sb.toString());
    }
}
