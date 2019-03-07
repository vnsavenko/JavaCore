package com.savenko.javacore.chapter08.abstrac;

abstract class A {
    abstract void callme();
    void callmetoo(){
        System.out.println("Это конкретный метод.");
    }
}

class B extends A{

    void callme() {
        System.out.println("Реализация абстр метода callme() ");
    }
}
class AbstrDemo{
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
