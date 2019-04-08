package com.savenko.javacore.chapter15;

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        double value = myNumber.getValue();
        System.out.println(value);

        myNumber = () -> Math.random() * 100;

        System.out.println(myNumber.getValue());
        System.out.println(myNumber.getValue());


    }

}
