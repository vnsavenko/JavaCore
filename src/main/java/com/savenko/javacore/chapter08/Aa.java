package com.savenko.javacore.chapter08;
// Использовать super с целью предотвратить сокрытие имен

public class Aa {

    int i;
}

class Bb extends Aa{
    int i;

    public Bb(int a, int b) {
        super.i = a; // член i класса Aa
        i = b;
    }
    void show(){
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper{
    public static void main(String[] args) {
        Bb subOb = new Bb(1, 2);
        subOb.show();
    }
}
