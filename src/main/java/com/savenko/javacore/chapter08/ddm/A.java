package com.savenko.javacore.chapter08.ddm;

public class A {
    void callme(){
        System.out.println("В методе callme() из класса A");
    }
}

class B extends A{
    void callme(){
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    //@Override
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}

class Dispatch{
    public static void main(String[] args) {
        /*A a = new A();
        B b = new B();
        C c = new C();

        A r; // получить ссылку на объект типа A

        r = a; // переменная r ссылается на объект типа A
        r.callme();// вызывается callme, определенный в классе A

        r = b; //  переменная r ссылается на объект типа B
        r.callme(); // вызывается callme, определенный в классе B

        r = c; //  переменная r ссылается на объект типа С
        r.callme(); // вызывается callme, определенный в классе C*/

        A arr[] = {new A(), new B(), new C()};
        for (A a: arr
             ) {
            a.callme();
        }
    }
}
