package com.savenko.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// использовать класс BufferedReader для чтения символов с консоли
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");
        //читать символы

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
