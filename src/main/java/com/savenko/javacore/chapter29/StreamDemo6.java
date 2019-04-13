package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(3.6);
        list.add(9.2);
        list.add(12.1);
        list.add(5.0);

        System.out.println("Исходные значения списка list: ");
        list.stream().forEach((a)-> System.out.print(a + " "));
        System.out.println();

        // Отобразить максимально допустимый предел каждого
        // значения из списка list на поток данных типа IntStream
        IntStream intStream = list.stream().mapToInt((a)->(int)Math.ceil(a));

        System.out.println("Максимально допустимые пределы значений из списка list: ");

        intStream.forEach((a)-> System.out.print(a + " "));
    }
}
