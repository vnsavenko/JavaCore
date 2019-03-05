package com.savenko.javacore.chapter06;

public class Box {
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("объем равен ");
        System.out.println(width * height * depth);
    }
}
