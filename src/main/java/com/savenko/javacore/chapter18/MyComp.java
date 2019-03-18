package com.savenko.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

//компаратор для сравнения символьных строк в обратном порядке
public class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {

        //выполнить сравнение в обратном порядке
        return a.compareTo(b);
    }

    // переопределять метод equals() не требуется
}

class CompDemo{
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<>(mc.reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы
        for (String elem : ts
             ) {
            System.out.print(elem + " ");
        }
        System.out.println();


    }
}



