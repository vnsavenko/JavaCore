package com.savenko.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("COPYRIGHT");
    }

}
