package com.savenko.javacore.chapter07;

public class TestStack {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack();

        for(int i=0; i<10;i++) st1.push(i);
        for(int i=0; i<10;i++) st2.push(i);

        System.out.println("Stack in st1:");
        for(int i=0; i<10;i++) System.out.println(st1.pop());

        System.out.println("Stack in st2:");
        for(int i=0; i<10;i++) System.out.println(st2.pop());

        //st1.tos = -2;
        //st1.stck[3]=100;
    }
}
