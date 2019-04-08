package com.savenko.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2)==0; // проверяет на четность

        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("Число 9 нечетное");

        NumericTest isNonNeg = n -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test( -1)) System.out.println("Число -1 отрицательное");
    }
}
