package com.savenko.javacore.chapter09.inerfaces.stack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        //разместить числа в стеке
        for (int i = 0; i < 5; i++) {
            fixedStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            fixedStack2.push(i);
        }


        //извлечь эти числа из стека

        System.out.println("Стек в Стек1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(fixedStack1.pop());
        }

        System.out.println("Стек в Стек2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(fixedStack2.pop());
        }
    }
}
