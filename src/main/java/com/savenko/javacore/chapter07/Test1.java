package com.savenko.javacore.chapter07;
// Аргументы примитивных типов передаются по значению
public class Test1 {
    void meth(int i, int j){
        i *= 2;
        j /= 2;

    }
}
class CallByValue{
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b =20;
        System.out.println("a and b before methods call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after methods call: " + a + " " + b);
    }
}