package com.savenko.javacore.chapter09.inerfaces;

public class AnotherClient implements Callback{
    public void callback(int param) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("param в квадрате равно " + param * param);
    }

    public void call(double param) {

    }
}
