package com.savenko.javacore.chapter18;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

    }



}
