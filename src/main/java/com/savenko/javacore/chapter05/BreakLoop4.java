package com.savenko.javacore.chapter05;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for (int i = 0; i<3; i++){
            System.out.print("Проход " + i + ": ");
            for (int j =0; j < 100; j++){
                if (j == 10) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}
