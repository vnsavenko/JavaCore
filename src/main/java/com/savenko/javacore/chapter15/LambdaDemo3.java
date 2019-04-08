package com.savenko.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (new NumericTest2() {
            @Override
            public boolean test(int n, int d) {
                return n % d == 0;
            }
        });

        if (isFactor.test(10, 2)) System.out.println("Число 2 является множителем числа 10");

        if (!isFactor.test(10, 3)) System.out.println("Число 3 не является множителем числа 10");
    }
}
