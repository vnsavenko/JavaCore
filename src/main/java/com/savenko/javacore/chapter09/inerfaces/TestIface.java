package com.savenko.javacore.chapter09.inerfaces;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);

    }

}
