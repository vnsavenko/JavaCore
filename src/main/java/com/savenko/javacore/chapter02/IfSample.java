package com.savenko.javacore.chapter02;

public class IfSample
{
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        //этот оператор не будетничего выводить
        if (x == y) System.out.println("вы не увидите этого");
    }
}
