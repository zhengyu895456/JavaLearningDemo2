package com.zeroten.string;

import com.zeroten.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {
    @Test
    public void testTrimAll(){
        String hello = "h e l lo ";
        Assert.assertEquals(StringUtils.trimAll(hello),"hello");
    }
    @Test
    public void testReverse(){
        String tmp = "123";
        Assert.assertEquals(StringUtils.reverseAll(tmp),"321");
    }
}
