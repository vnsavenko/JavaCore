package com.savenko.javacore.chapter07;

public class OverloadDemo {
    void test(){
        System.out.println("Параметры отсутсвуют");
    }

    //Перегружаемый метод, проверяющий наличие
    // одного целочисленного парамета

    void test(int a){
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }


}
