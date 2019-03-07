package com.savenko.javacore.chapter09.inerfaces.stack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        // в этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) {
            dynStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            dynStack2.push(i);
        }
        System.out.println("Стек 1 : ");
        for (int i = 0; i < 12; i++) {
            System.out.println(dynStack1.pop());
        }

        System.out.println("Стек 2 : ");
        for (int i = 0; i < 20; i++) {
            System.out.println(dynStack2.pop());
        }
    }
}
