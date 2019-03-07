package com.savenko.javacore.chapter09.myPack;

public class Balance {
    String name;
    double bal;

    public Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }
    public void show(){
        if (bal<0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}
