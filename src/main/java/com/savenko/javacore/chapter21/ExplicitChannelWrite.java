package com.savenko.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("alphabeta.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)){

            //создать буфер
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);

            //записать некторое количество байт в буфер
            for (int i = 0; i < 26; i++) {
                byteBuffer.put((byte)('A' + i));
            }

            //подготовить буфер к записи данных
            byteBuffer.rewind();

            // записать данные из буфера в выходной файл

            fileChannel.write(byteBuffer);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            System.exit(1);
        }

    }

}
