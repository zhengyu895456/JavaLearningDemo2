package com.zeroten.flow;

public class Palindrome {
    public static boolean isPalindrome(int num){
        if (num < 0 || (num % 10 == 0 && num != 0)){
            return false;
        }else{
            int revertedNum = 0;
            while (num > revertedNum) {
                revertedNum = num % 10 + revertedNum * 10;
                num /= 10;
            }
            return (num == revertedNum || num == revertedNum / 10);
        }
    }
}
