package com.savenko.javacore.chapter08;

public class Box {
    public String weight;
    double width;
    double height;
    double depth;

    // clone

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    public Box(double len) {
         width = height = depth = len;
    }

    double vol(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight b2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = b1.vol();
        System.out.println("b1 volume : " + vol);
        System.out.println("b1 weight : " + b1.weight);
        System.out.println();

        vol = b2.vol();
        System.out.println("b2 volume : " + vol);
        System.out.println("b2 weight : " + b2.weight);
    }
}