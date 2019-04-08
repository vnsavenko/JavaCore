package com.savenko.javacore.chapter20;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; i++) {
            int c;
            while ((c=inputStream.read())!=-1){
                if (i == 0){
                    System.out.print((char)c);
                } else {
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            inputStream.reset();
        }
    }
}
