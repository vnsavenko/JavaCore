package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {

        // создат список символьных строк
        ArrayList<String> list = new ArrayList<>();
        list.add("Альфа");
        list.add("Бета");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Кси");
        list.add("Омега");

        //получить поток данныъ для списочного массива
        Stream<String> myStream = list.stream();

        //получить сплитератор
        Spliterator<String> spliterator = myStream.spliterator();

        // а теперь разделить первый итератор
        Spliterator<String> spliterator2 = spliterator.trySplit();

        //использовать сначал итератор spliterator2, если
        // нельзя разделить итератор spliterator
        if (spliterator2 !=null){
            System.out.println("Результат, выводимы итератором spltertator2: ");
            spliterator2.forEachRemaining((n)-> System.out.println(n));

        }

        // а теперь воспользоваться итератором spliterator

        System.out.println("\nРезультатб выводимый итератором spliterator: ");
        spliterator.forEachRemaining((n)-> System.out.println(n));


    }
}
