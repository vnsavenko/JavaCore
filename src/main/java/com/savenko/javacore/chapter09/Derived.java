package com.savenko.javacore.chapter09;

public class Derived extends Protection{
    Derived(){
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

        //Доступно только для суперкласса
        //System.out.println("n_pri = 4" + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
