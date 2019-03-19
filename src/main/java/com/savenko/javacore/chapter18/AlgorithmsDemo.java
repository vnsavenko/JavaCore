package com.savenko.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // создать неинициализированный связный список
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        System.out.println("Начальный вид коллекции: ");
        for (int i : linkedList
        ) {
            System.out.print(i + " ");
        }
        System.out.println();

        //создать компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();

        //отсортировать список с помощью этого компаратора
        Collections.sort(linkedList, r);
        System.out.println("Список отсортирован в обратном порядке: ");

        for (int i : linkedList
             ) {
            System.out.print(i + " ");
        }
        System.out.println();

        //перетасовать список
        Collections.shuffle(linkedList);
        System.out.println("Список перетасован: ");
        for (int i :linkedList
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Минимум: " + Collections.min(linkedList));
        System.out.println("Максимум: " + Collections.max(linkedList));
    }
}
