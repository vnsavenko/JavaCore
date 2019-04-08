package com.savenko.javacore.chapter20;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(b, 0, 3);
        int c;
        while ((c = inputStream2.read()) !=-1)
        {
            System.out.print((char)c + " ");
        }
    }
}
