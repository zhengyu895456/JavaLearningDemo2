package com.zeroten.flow;

public class VampireNum {
    public static int a(int i) {
        return i / 1000;
    }
    public static int b(int i) {
        return (i % 1000) / 100;
    }
    public static int c(int i) {
        return ((i % 1000) % 100) / 10;
    }
    public static int d(int i) {
        return i % 10;
    }
    public static int com(int i, int j) {
        return (i * 10) + j;
    }
    public static void productTest (int i, int m, int n) {
        if(m * n == i) {
            System.out.println(i + " = " + m + " * " + n);
        }
    }
}
