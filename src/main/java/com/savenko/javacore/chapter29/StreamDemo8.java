package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        // создат список символьных строк
        ArrayList<String> list = new ArrayList<>();
        list.add("Альфа");
        list.add("Бета");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Кси");
        list.add("Омега");

        //получить поток данных для списочного массива
        Stream<String> stringStream = list.stream();

        //получить итератор для потока данных
        Iterator<String> iterator = stringStream.iterator();

        //перебрать элементы в потоке данных
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
