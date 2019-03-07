package com.savenko.javacore.chapter09.inerfaces;

public abstract class Incomplete implements Callback {
    int a, b;
    public void callback(int b) {

        System.out.println(a + " " + b);

    }
}
