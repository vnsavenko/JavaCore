package com.savenko.javacore.chapter21;

import sun.nio.ch.FileChannelImpl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExcplicitChannelRead {
    public static void main(String[] args) {
        int count;
        int step = 0;
        // затем получить канал к этому файлу
        //FileChannelImpl fileChannel = new FileChannelImpl();
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("file2.txt"))) {

            //выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(32);

            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuf);
                System.out.println("step: " + step);
                System.out.println("count: " + count);

                // прекратить чтение по достижении конца файла
                if (count !=-1){
                    //подготовить буфер к чтению из него данных
                    mBuf.rewind();

                    //читать байты из буфера и выводить их на экран как символы

                    for (int i = 0; i < count; i++) {
                        System.out.print((char)mBuf.get());
                    }
                    //System.out.println();
                }
                step++;
            } while (count !=-1);
            System.out.println();


        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        }
        catch (IOException e){
            System.out.println("IO error: " + e);
        }
    }
}
