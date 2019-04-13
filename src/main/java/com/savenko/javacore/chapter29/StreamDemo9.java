package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
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

        //получить итератор-разделитель

        Spliterator<String> spliterator = myStream.spliterator();

        //перебрать элементы в потоке данных
        //while (spliterator.tryAdvance((n)-> System.out.println(n)));

        spliterator.forEachRemaining((n)-> System.out.println(n));

    }
}
