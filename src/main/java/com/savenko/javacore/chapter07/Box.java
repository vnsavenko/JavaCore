package com.savenko.javacore.chapter07;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double length) {
        width = height = depth = length;
    }

    double vol(){
        return width * height * depth;
    }
}
 class OverloadCons{
     public static void main(String[] args) {
         Box b1 = new Box(10, 20, 15);
         Box b2 = new Box();
         Box cube = new Box(7);

         double vol;
         vol = b1.vol();
         System.out.println("Volume of b1 = " + vol);

         vol = b2.vol();
         System.out.println("Volume of b2 = " + vol);

         vol = cube.vol();
         System.out.println("Volume of cube = " + vol);

     }
 }
