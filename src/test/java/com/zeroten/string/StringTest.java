package com.zeroten.string;

import org.testng.annotations.Test;

import java.awt.*;

public class StringTest {
    @Test
    public void test字符串内存使用(){
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        String str3 = "hello world";
        String str4 = str1 + "world";
        System.out.println(str3 == str4);

        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println("Str5 = str6," + (str5 == str6));
        String str7 = str6.intern();
        System.out.println("str1 = str7," + (str1 == str7));
    }
    @Test
    public void testLength(){
        String str = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length is: " + str.length());
        System.out.println("code point count is: " + str.codePointCount(0, str.length()));
    }
    @Test
    public void testSubstring(){
        String str1 = "Hello, China.";
        String str2 = str1.substring(7,str1.length());
        String str3 = str1.substring(7);
        System.out.println(str2);
        System.out.println(str3);
        String str4 = str1.substring(7,str1.length() - 1);
        System.out.println(str4);
    }
    @Test
    public void testMerge(){
        String str1 = "hello" + "world";
        str1 += "." + "2019";
        System.out.println(str1);
    }
    @Test
    public void testFormat(){
        String str1 = "大写a：" + "A" + " " + "\n";
        System.out.println(str1);
        String str2 = String.format("大写a：%c, 它的ASCII码是：%d %n",'A',(int)'A');
        System.out.println(str2);
    }
    @Test
    public void testEqual(){
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
    @Test
    public void testJu(){
        String str1 = "hello";
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.contains("ell"));
    }
    @Test
    public void testFind(){
        String str1 = "hello, world. today is 2019-12-10. say hi to me.";
        int index1 = -1;
        do {
            int at1 = str1.indexOf("o", index1 + 1);
            if(at1 == -1){
                break;
            }
            System.out.println(String.format("第%d位是小写字母o", at1 + 1));
            index1 = at1;
        }while(true);
        int at2 = str1.lastIndexOf("o");
        System.out.println(at2);

        int index2 = str1.length();
        do{
            int at1 = str1.lastIndexOf("o",index2 - 1);
            if (at1 == -1){
                break;
            }
            System.out.println(String.format("第%d位是小写字母o", at1 + 1));
            index2 = at1;
        }while(true);
    }
    @Test
    public void testReplace(){
        String str1 = "Hello, world!";
        System.out.println(str1.replace("o","A"));
        System.out.println(str1.replace("o","OOO"));
        System.out.println(str1.replaceAll("o","OO"));
    }
    @Test
    public void testTrim(){
        String str1 = "    Hello    ,      world!";
        System.out.println(str1);
        System.out.println(str1.trim());
    }
    @Test
    public void testUpperLower(){
        String str1 = "Hello, world!";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String strEmpty = "";
        String strNull = null;
    }
    @Test
    public void testNew(){
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);
        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");
        sb1.append(',');
        sb1.append("world");
        sb1.append('.');
        System.out.println(sb1.toString());
        System.out.println(sb1.length());
        sb1.setLength(10);
        System.out.println(sb1.toString());
        sb1.setLength(20);
        System.out.println(sb1.toString());
    }
    @Test
    public void testNew2(){
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(',');
        sb1.append("world");
        sb1.append('.');
        System.out.println(sb1.toString());
        System.out.println(sb1.length());
        sb1.setLength(10);
        System.out.println(sb1.toString());
        sb1.setLength(20);
        System.out.println(sb1.toString());
    }
    @Test
    public void testOpt1(){
        String str1 = "hello" + ",world.";
        System.out.println(str1);

        String str2 = str1 + "say hi.";
        System.out.println(str2);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(str1);
        sb1.append("say hi.");
        System.out.println(sb1.toString());
    }
    @Test
    public void testOpt2(){
        String str1 = "hello,world.";
        System.out.println(str1);
    }
    @Test
    public void testOpt3() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int n = 0; n < 50000; n++) {
            str += n;
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
    }
    @Test
    public void testOpt4(){
        long start = System.currentTimeMillis();
        String str = "";
        for (int n = 0; n < 50000; n++){
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(n);
            str = sb.toString();
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
    }
    @Test
    public void testOpt5() {
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int n = 0; n < 50000; n++) {
            str.append(n);
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
    }
}
