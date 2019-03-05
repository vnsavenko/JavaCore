package com.savenko.javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box2 b1 = new Box2();
        Box2 b2 = new Box2();
        double vol;

        b1.setDim(10, 20, 15);
        b2.setDim(3, 6, 9);

        //объем первого
        vol = b1.volume();
        System.out.println("Volume is: " + vol);

        //объем второго
        vol = b2.volume();
        System.out.println("Volume is: " + vol);


    }

}
class Box2 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
    //установить размеры параллепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}