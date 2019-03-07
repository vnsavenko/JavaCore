package com.savenko.javacore.chapter09.inerfaces;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob; // теперь с ссылается на объект AnotherClient
        c.callback(42);


    }
}
