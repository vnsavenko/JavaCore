package com.savenko.javacore.chapter06;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box();
        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;

        b2.width = 3;
        b2.height = 6;
        b2.depth =9;

        b1.volume();
        b2.volume();
    }
}
