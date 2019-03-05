package com.savenko.javacore.chapter06;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1();

        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;

        b2.width = 3;
        b2.height = 6;
        b2.depth =9;

        System.out.println("объем равен " + b1.volume());
        System.out.println("объем равен " + b2.volume());
    }
}

class Box1 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
}