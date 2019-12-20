package com.zeroten.inherit;

import org.testng.annotations.Test;

public class AbstractTest {
    @Test
    public void testPrint(){
        Person p1 = new Teacher();
        System.out.println(p1.getDescription());

        Person p2 = new Student();
        System.out.println(p2.getDescription());
    }
}
