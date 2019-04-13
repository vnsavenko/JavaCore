package com.savenko.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(7.0);
        doubles.add(18.0);
        doubles.add(10.0);
        doubles.add(24.0);
        doubles.add(17.0);
        doubles.add(5.0);

        double prodSqrRoots = doubles.parallelStream().reduce(1.0, (a,b)-> a * Math.sqrt(b), (a,b)-> a * b);

        System.out.println("Произведение квадратных корней: " + prodSqrRoots);


        prodSqrRoots = 1;
        for (double d: doubles
             ) {
            prodSqrRoots*=Math.sqrt(d);
        }

        System.out.println("Произведение квадратных корней: " + prodSqrRoots);

    }
}
