package com.savenko.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        //получить канал к файлу в блоке
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("file2.txt"))){
            //получить размер файла
            long fsize = fileChannel.size();
            // а теперь сопоставить файл с буфером
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fsize);

            //читать байты из буфера
            for (int i = 0; i < fsize; i++) {
                System.out.print((char)mappedByteBuffer.get());
            }
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " +e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
