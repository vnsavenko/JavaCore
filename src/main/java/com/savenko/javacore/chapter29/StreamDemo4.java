package com.savenko.javacore.chapter29;

import com.savenko.javacore.chapter03.Array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        Stream<Double> sqrtStream = list.stream().map((a)->Math.sqrt(a));

        double prodSqrt = sqrtStream.reduce(1.0, (a,b)->a*b);

        System.out.println("Произведение кв корней равно: " + prodSqrt);


    }
}
