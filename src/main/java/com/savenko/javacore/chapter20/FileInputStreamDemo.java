package com.savenko.javacore.chapter20;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try(FileInputStream f = new FileInputStream("C:\\Projects\\JavaCore\\src\\main\\java\\com\\savenko\\javacore\\chapter20\\FileInputStreamDemo.java")){
            System.out.println("Общкк количество доступных байт: " + (size = f.available()));

            int n = size / 40;
            System.out.println("Первые " + n + " байт, " + " прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nВсе еще доступно: " + f.available());
            System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) !=n) {
                System.out.println("Нельзя прочитать " + n + " байт.");
            }
            System.out.println(new String(b,0,n));
            System.out.println("\nВсе еще доступно: " + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байт методом skip()");
            f.skip(size/2);
            System.out.println("Все еще доступно: " + f.available());
            System.out.println("Чтение " + n/2 + " байт, размещенных в конче массива.");
            if (f.read(b,n/2,n/2) != n/2){
                System.err.println("Нельзя прочитать " + n/2 + " байт.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно: " + f.available());
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
