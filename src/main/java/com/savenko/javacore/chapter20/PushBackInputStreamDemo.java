package com.savenko.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

// синтаксический анализатор языка программирования
public class PushBackInputStreamDemo {
    public static void main(String[] args) {


     String s = "if (a == 4) a =00;\n";
     byte buf[] = s.getBytes();
     ByteArrayInputStream in = new ByteArrayInputStream(buf);
     int c;

     try (PushbackInputStream f = new PushbackInputStream(in);){
        while ((c = f.read()) != -1) {
            switch (c) {
                case '=':
                    if ((c = f.read()) == '=')
                        System.out.print(".eq.");
                    else {
                        System.out.print("<-");
                        f.unread(c);
                    }
                    break;
                default:
                    System.out.print((char) c);
                    break;
            }
        }
    } catch (IOException e){
         System.out.println("Ошибка ввода-вывода: " + e);
     }
    }

}
