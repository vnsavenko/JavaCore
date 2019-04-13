package com.savenko.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("alphatest.txt")))){
            for (int i = 0; i < 26; i++) {
                fout.write((byte)('a' + i));
            }
        }catch (InvalidPathException e){
            System.out.println("Inv file path: " + e);
        }catch (IOException e) {
            System.out.println("IO error: " + e);
        }
    }
}
