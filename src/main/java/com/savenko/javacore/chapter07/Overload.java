package com.savenko.javacore.chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double res;

        //вызвать все аврианты test
        od.test();
        od.test(10);
        od.test(10, 20);
        res = od.test(123.25);
        System.out.println("результат вызова od.test(123.5): " + res);
    }
}
