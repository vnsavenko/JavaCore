package com.savenko.javacore.chapter20;

import java.io.Serializable;

public class MyClass implements Serializable {

    transient String s;
    int i;
      double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
