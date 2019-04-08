package com.savenko.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc3 myClass2Cons =  MyClass2::new;
        MyClass2 mc = myClass2Cons.func(100);

        System.out.println("Значение val в объекте mc равно: " + mc.getVal());

    }
}
