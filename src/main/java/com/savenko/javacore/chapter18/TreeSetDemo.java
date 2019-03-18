package com.savenko.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");
        ts.add("d");


        System.out.println(ts);

        System.out.println(ts.subSet("c", "f"));

    }
}
