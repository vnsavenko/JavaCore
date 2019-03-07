package com.savenko.javacore.chapter09.inerfaces;

public class Client implements Callback {
    public void callback(int param) {
        System.out.println("Метод callback(), вызываемый со значением " + param);
    }

    public void call(double param) {

    }

    void nonIfaceMeth(){
        System.out.println("в классах, реализ интерфейсы, " +
                "могут определятся и другие члены");
    }


}
