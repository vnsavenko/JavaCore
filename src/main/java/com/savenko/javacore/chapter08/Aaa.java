package com.savenko.javacore.chapter08;

public class Aaa {
    public Aaa() {
        System.out.println(" In constructor of Aaa.");
    }
}

class Bbb extends Aaa{
    public Bbb() {
        System.out.println(" In constructor of Bbb.");
    }
}

class Ccc extends Bbb{
    public Ccc() {
        System.out.println(" In constructor of Ccc.");
    }
}

class CallingCons{
    public static void main(String[] args) {
        Ccc c = new Ccc();
    }

}
