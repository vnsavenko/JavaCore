package com.savenko.javacore.chapter07;
// another recursion example
public class RecTest {
    int values[];

    RecTest(int i){
        values = new int[i];
    }

    //print members of array recuesively
    void printArray(int i) {
        //System.out.println(" step" + i + " ");
        if (i==0) return;

        else printArray(i-1);
        System.out.print("[" + (i-1) + "] " + values[i-1]);
        System.out.println(" step" + i + " ");

    }
}

class Recursion2{
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (i=0; i<10;i++) ob.values[i] = i;
        ob.printArray(2);
    }
}