package com.savenko.javacore.chapter15;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Массив пуст");
    }
}
