package com.savenko.javacore.chapter06;

public class BoxDemo7 {
    public static void main(String[] args) {


    double vol;

    Box4 b1 = new Box4(10, 20, 15);
    Box4 b2 = new Box4(3, 6, 9);

    vol = b1.vol();
        System.out.println("Объем первого " + vol);

        vol = b2.vol();
        System.out.println("Объем второго " + vol);
    }


}

class Box4{
    double width;
    double height;
    double depth;

    public Box4(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double vol(){
        return width * height * depth;
    }
}
