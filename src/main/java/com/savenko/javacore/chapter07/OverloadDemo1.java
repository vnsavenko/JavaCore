package com.savenko.javacore.chapter07;

public class OverloadDemo1 {
    void test(){
        System.out.println("Параметры отстутствуют");
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a) {
        System.out.println("Внутренне преобразование при вызова test(double) a: " + a);
    }

    void test(int a){
        System.out.println("int a : " + a);
    }

}

class Overload1{
    public static void main(String[] args) {
        OverloadDemo1 od = new OverloadDemo1();
        int i = 88;
        od.test();
        od.test(10, 20);
        od.test(i);
        od.test(123.2);
        od.test(i);
    }
}
