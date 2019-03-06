package com.savenko.javacore.chapter07;

public class Outer {
    int outer_x = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();

    }

    void showy(){
      // System.out.println(y);// перем y не доступна
    }
    class Inner{
        int y = 10; // локальная переменная класса Inner

        void display(){
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
