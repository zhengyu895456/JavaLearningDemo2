package com.zeroten.util;

public class StringUtils {
    public static String trimAll(String str) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (c == ' ') {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static String reverseAll(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int index = chars.length - 1; index >= 0; index--){
            char c = chars[index];
            sb.append(c);
        }
        return sb.toString();
    }
}
