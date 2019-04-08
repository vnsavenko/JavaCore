package com.savenko.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        //попытка открыть файл

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);


        } catch (IOException e) {
            System.out.println("Ошибка  ввода - вывода: " + e);
        } finally {

            // закрыть файл
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}