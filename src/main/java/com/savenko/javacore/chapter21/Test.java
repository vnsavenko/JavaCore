package com.savenko.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("file1.txt");
        FileChannel channel = fileInputStream.getChannel();


        channel.read(ByteBuffer.wrap(new byte[32]));



    }
}
