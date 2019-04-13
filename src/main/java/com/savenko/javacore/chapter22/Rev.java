package com.savenko.javacore.chapter22;

public class Rev {
    public static void main(String[] args) {
        String s = "ПТица";
        String rev = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            rev+=s.charAt(i);
        }
        System.out.println(s);
        System.out.println(rev);
    }
}
