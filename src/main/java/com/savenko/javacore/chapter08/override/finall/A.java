package com.savenko.javacore.chapter08.override.finall;

public class A {
    final void meth(){
        System.out.println("Это завершенный метод");

    }
}

class B extends A{
    //void meth(){}//Ошибка. Нельзя переопределить
}

class Test{
    public static void main(String[] args) {
        System.out.println("Hash code A: " + new A().hashCode());
        System.out.println("toString anotherA: " + new A().toString());
        System.out.println("toString anotherA: " + new A().toString());
    }
}
