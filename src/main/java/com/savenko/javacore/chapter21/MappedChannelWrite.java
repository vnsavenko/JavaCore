package com.savenko.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("alphs.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            //затем сопоставить файл (канал) с буфером
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // записать заданное количество байтов в буфер

            for (int i = 0; i < 26; i++) {
                mappedByteBuffer.put((byte)('a' + i));
            }
        } catch (InvalidPathException e){
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }

}
