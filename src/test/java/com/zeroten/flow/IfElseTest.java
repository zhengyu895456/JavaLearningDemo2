package com.zeroten.flow;

import org.testng.annotations.Test;

public class CodeBlock{
    @Test
    public void testBlockScope(){
        int n1 = 100;
        System.out.println(n1);
        {
            int n2 = 200;
            //int n1 = 200;
            System.out.println(n1);
        }
        int n2 = 201;
        System.out.println(n2);
    }
}
public class IfElseTest {

    @Test
    public void testIfElse() {
    }

}
