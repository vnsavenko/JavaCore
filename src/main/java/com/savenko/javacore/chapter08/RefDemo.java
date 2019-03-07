package com.savenko.javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.vol();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // присвоить ссылку на объект BoxWeight ссылке на  объект Box
        plainbox = weightbox;
        vol = plainbox.vol();
        System.out.println("Объем planebox равен: " + vol);
        System.out.println("Вес planebox равен: " + plainbox.weight);


    }
}
