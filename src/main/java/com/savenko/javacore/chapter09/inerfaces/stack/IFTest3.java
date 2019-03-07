package com.savenko.javacore.chapter09.inerfaces.stack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; // создать переменную ссылки на интерфейс
        DynStack dynStack = new DynStack(5);
        FixedStack fixedStack = new FixedStack(8);
        mystack = dynStack; //загрузить динамич стек
        //разместить числа в стеке
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        mystack = fixedStack; //загрузить фикс стек
        //разместить числа в стеке
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }

        mystack = dynStack;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i <12; i++) {
            System.out.println(mystack.pop());
        }

        mystack = fixedStack;
        System.out.println("Значения в фикс стеке:");
        for (int i = 0; i <8; i++) {
            System.out.println(mystack.pop());
        }
        mystack.clear();

    }
}
