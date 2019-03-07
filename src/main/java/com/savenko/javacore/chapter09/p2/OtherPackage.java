package com.savenko.javacore.chapter09.p2;

import com.savenko.javacore.chapter09.Protection;

import javax.print.attribute.standard.MediaSize;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + p.n);

        //доступно только для данного класса
        //System.out.println("n_pri = " + p.n_pri);

        //доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
