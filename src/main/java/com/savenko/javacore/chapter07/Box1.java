package com.savenko.javacore.chapter07;

public class Box1 {
    double width;
    double height;
    double depth;

    public Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }
    public Box1(double len) {
        width = height = depth = len;
    }

    double vol(){
        return width * height * depth;
    }

}

class OverloadCons2{
    public static void main(String[] args) {
        double vol;

        Box1 b1 = new Box1(10,20,15);
        Box1 b2 = new Box1();
        Box1 cube = new Box1(7);
        Box1 clone = new Box1(b1);

        vol = b1.vol();
        System.out.println("b1 volume : " + vol);

        vol = b2.vol();
        System.out.println("b2 volume : " + vol);

        vol = cube.vol();
        System.out.println("cube volume : " + vol);

        vol = clone.vol();
        System.out.println("clone volume : " + vol);
    }
}
