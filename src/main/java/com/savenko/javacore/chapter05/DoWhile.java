package com.savenko.javacore.chapter05;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
        } while (--n>0);
    }
}
