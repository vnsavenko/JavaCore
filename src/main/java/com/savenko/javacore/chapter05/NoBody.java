package com.savenko.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        // рассчитать среднее значение i и j

        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
