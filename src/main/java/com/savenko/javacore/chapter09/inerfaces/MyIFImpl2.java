package com.savenko.javacore.chapter09.inerfaces;

public class MyIFImpl2 implements MyIF {
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "Это другая символьная строка.";
    }
}
