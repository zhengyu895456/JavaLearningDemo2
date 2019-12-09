package com.zeroten.flow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckTest {
    //String AgeCheck.getAgeName(int age)

    @Test
    public void testAgeCheck1() {
        Assert.assertEquals(AgeCheck.getAgeName(6), "儿童");//given
        Assert.assertEquals(AgeCheck.getAgeName(7), "少年");
        Assert.assertEquals(AgeCheck.getAgeName(20), "青年");//when
    }//then
    public void testAgeCheck2() {
        Assert.assertEquals(AgeCheck.getAgeName(6), "儿童");//given
        Assert.assertEquals(AgeCheck.getAgeName(7), "少年");
        Assert.assertEquals(AgeCheck.getAgeName(20), "青年");// when
    }//then
}