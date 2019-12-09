package com.zeroten.flow;

import org.testng.annotations.Test;

import static com.zeroten.flow.VampireNum.*;

public class VampireNumTest {
    @Test
    public void testVampireNum(){
        for(int i = 1001; i < 9999; i++) {
            int a = a(i);
            int b = b(i);
            int c = c(i);
            int d = d(i);
            productTest(i, com(a, b), com(c, d));
            productTest(i, com(a, b), com(d, c));
            productTest(i, com(a, c), com(b, d));
            productTest(i, com(a, c), com(d, b));
            productTest(i, com(a, d), com(b, c));
            productTest(i, com(a, d), com(c, b));
            productTest(i, com(b, a), com(c, d));
            productTest(i, com(b, a), com(d, c));
            productTest(i, com(b, c), com(d, a));
            productTest(i, com(b, d), com(c, a));
            productTest(i, com(c, a), com(d, b));
            productTest(i, com(c, b), com(d, a));
        }
    }
}
