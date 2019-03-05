package com.savenko.javacore.chapter06;

public class BoxDemo6 {
    public static void main(String[] args) {
        double vol;

        Box3 b1 = new Box3();
        Box3 b2 = new Box3();

        vol = b1.vol();
        System.out.println("Объем первого равен " + vol);

        vol = b2.vol();
        System.out.println("Объем второго равен " + vol);

    }
}

class Box3{
    double width;
    double height;
    double depth;

    //Constructor

    Box3(){
        System.out.println("Конструирование объекта Box3");
        width = 10;
        height = 10;
        depth = 10;
        }
        double vol(){
        return  width * height * depth;
        }
}
