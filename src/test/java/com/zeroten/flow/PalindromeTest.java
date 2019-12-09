package com.zeroten.flow;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.zeroten.flow.Palindrome.isPalindrome;

public class PalindromeTest {
    @Test
    public void isPalindromeTest(){
        Assert.assertTrue(isPalindrome(101));
        Assert.assertFalse(isPalindrome(123));
        Assert.assertTrue(isPalindrome(12021));
        Assert.assertTrue(isPalindrome(1331));
        Assert.assertFalse(isPalindrome(14560));
        Assert.assertFalse(isPalindrome(10004));
    }
}
