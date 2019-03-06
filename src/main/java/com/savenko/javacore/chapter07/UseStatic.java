package com.savenko.javacore.chapter07;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println(" x = " + x);
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    static {
        System.out.println("Static block init");
        b = a * 4;
    }

    public static void main(String[] args) {
       UseStatic. meth(42);

    }
}
