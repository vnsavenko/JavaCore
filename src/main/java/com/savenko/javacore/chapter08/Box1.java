package com.savenko.javacore.chapter08;

public class Box1 {
    private double width;
    private double height;
    private double depth;

    // clone

    Box1(Box1 ob){
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

class BoxWeight1 extends Box1{
    double weight; // weight

    public BoxWeight1(BoxWeight1 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight1(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight1() {
        super();
        weight = -1;
    }

    public BoxWeight1(double len, double weight) {
        super(len);
        this.weight = weight;
    }

  }

class DemoSuper{
    public static void main(String[] args) {
        BoxWeight1 b1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 b2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 b3 = new BoxWeight1();
        BoxWeight1 cube = new BoxWeight1(3, 2);
        BoxWeight1 clone = new BoxWeight1(b1);
        double vol;

        vol = b1.vol();
        System.out.println("b1 volume " + vol);
        System.out.println("b1 weight " + b1.weight);
        System.out.println();

        vol = b2.vol();
        System.out.println("b2 volume " + vol);
        System.out.println("b2 weight " + b2.weight);
        System.out.println();

        vol = b3.vol();
        System.out.println("b3 volume " + vol);
        System.out.println("b3 weight " + b3.weight);
        System.out.println();

        vol = clone.vol();
        System.out.println("clone volume " + vol);
        System.out.println("clone weight " + clone.weight);
        System.out.println();

        vol = cube.vol();
        System.out.println("cube volume " + vol);
        System.out.println("cube weight " + cube.weight);
        System.out.println();
    }
}
