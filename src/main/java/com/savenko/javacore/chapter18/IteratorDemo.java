package com.savenko.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("Исходное содержимое списочного массива al: ");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //видоизменить перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // отобразить список в обратном порядке
        System.out.println("Измененный в обратном порядке список: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(al);
    }

}
