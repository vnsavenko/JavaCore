package com.savenko.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileAutoClose {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Использование: ShowFileAutoClose имя_файла");
            return;
        }

        // далее применяется try with resources

        try (FileInputStream fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if (i != -1) System.out.print((char)i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
