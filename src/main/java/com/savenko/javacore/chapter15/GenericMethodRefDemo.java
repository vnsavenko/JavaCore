package com.savenko.javacore.chapter15;

public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc2 f, T[] vals, T v){
        return f.func(vals,v);
    }


    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] str = { "Один", "Два", "Три", "Два" };
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, str, "Два");
        System.out.println("Массив str содержит " + count + " числа Два ");


    }
}
