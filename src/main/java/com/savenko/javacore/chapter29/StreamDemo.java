package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //создать списочный массив типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // получить поток элементов списочного массива
        Stream<Integer> stream = myList.stream();

        //получить минимальное и максимально значения, вызвав методы
        //min() max() isPresent() get()

        Optional<Integer> min = stream.min(Integer::compare);
        if (min.isPresent()) System.out.println(
                "Минимальное значение: " + min.get());

        //непременно получить новый поток данных, поскольку
        // предыдущий вызов метода min() стал оконечной операцмей,
        // употребившей поток данных
        stream = myList.stream();

        Optional<Integer> max = stream.max(Integer::compare);
        if (max.isPresent()) System.out.println(
                "Максимальное значение: " + max.get());

        //отсортировать поток данных, вызва метод sortred()
        Stream<Integer> sorted = myList.stream().sorted();

        // отобразить отсортированный поток данных, вызвав метод forEach()
        System.out.println("Отсортированный поток данных: ");
        sorted.forEach((n)-> System.out.print(n + " "));
        System.out.println();

        //вывести только нечетные целочисленные значения, вызвав метод filter()

        Stream<Integer> integerStream = myList.stream().sorted().filter(n -> (n % 2) == 1);

        System.out.println("Нечетные значения: ");
        integerStream.forEach((n)-> System.out.print(n + " "));
        System.out.println();

        //вывести только те нечетные целочисленные значения,
        // которые больше 5.
        // Применяем конвейеризацию операций:

        Stream<Integer> integerStream1 = myList.stream().filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.println("Нечетные значения, больше 5");
        integerStream1.forEach((n)-> System.out.print(n + " "));
        System.out.println();




    }
}
