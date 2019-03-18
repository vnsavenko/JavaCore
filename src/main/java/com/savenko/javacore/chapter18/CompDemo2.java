package com.savenko.javacore.chapter18;

import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((a, b)->b.compareTo(a));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String el: ts
             ) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
