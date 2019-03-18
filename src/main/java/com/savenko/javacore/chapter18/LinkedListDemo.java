package com.savenko.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");

        System.out.println("Исходное содержимое связного списка linkedList: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("содержимое связного списка linkedList псоле удаления элементов: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("содержимое связного списка linkedList псоле удаления первого и последнего элементов: " + linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val + " изменено");

        System.out.println("содержимое связного списка linkedList псоле изменения: " + linkedList);

    }
}
