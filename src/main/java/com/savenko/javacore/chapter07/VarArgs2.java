package com.savenko.javacore.chapter07;

public class VarArgs2 {
    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length + " " + "Содержимое: ");

        for(int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("один параметр перем длины: ", 10);
        vaTest("Три параметр перем длины: ", 1, 2, 3);
        vaTest("Без параметр перем длины: ");
    }
}
