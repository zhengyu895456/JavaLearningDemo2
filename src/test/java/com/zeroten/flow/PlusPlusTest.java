package com.zeroten.flow;

import org.testng.annotations.Test;

public class PlusPlusTest {
    @Test
    public void testPlus(){
        int n1 = 1;
        n1 = ++n1;
        System.out.println(n1);

        int n2 = 1;
        n2 = n2++;
        System.out.println(n2);

        int n3 = 1;
        n3 = --n3;
        System.out.println(n3);

        int n4 = 1;
        n4 = n4--;
        System.out.println(n4);
    }
}
