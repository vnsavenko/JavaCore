package com.savenko.javacore.chapter08;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    // clone

    Box2(Box2 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double vol(){
        return width * height * depth;
    }

}

class BoxW extends Box2{
    double weight;

    public BoxW(BoxW ob) {
        super(ob);
        weight = ob.weight;
    }

    public BoxW(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxW() {
        super();
        weight = -1;
    }

    public BoxW(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

class Shipment extends BoxW{
    double cost;

    public Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment() {
        super();
        cost = -1;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.vol();
        System.out.println(" volume of shipment1 : " + vol);
        System.out.println(" weight of shipment1 : " + shipment1.weight);
        System.out.println(" Shipment cost : $" + shipment1.cost);
        System.out.println();

        vol = shipment2.vol();
        System.out.println(" volume of shipment2 : " + vol);
        System.out.println(" weight of shipment2 : " + shipment2.weight);
        System.out.println(" Shipment cost : $" + shipment2.cost);
        System.out.println();

    }
}