package com.zeroten.classobject;

import org.testng.annotations.Test;

public class ClassMethodOverloading {
    public void println(){

    }
    public void println(int num){

    }
    public void println(String str){

    }
    public void println(int num1, int num2){

    }
    @Test
    public void testOverloading(){
        println();
        println(2);
        println("s" );
        println(1,3);
    }
}
