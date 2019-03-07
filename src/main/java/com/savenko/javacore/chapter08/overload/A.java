package com.savenko.javacore.chapter08.overload;

public class A {
    int i, j;

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show(){
        System.out.println("i : j " + i + " : " + j);

    }
}

class B extends A{
    int k;

    public B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(String msg) {
        System.out.println(msg + k);
        }
}

class Override{
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show("Это k: ");
        subOb.show();
    }
}