package com.savenko.javacore.chapter22;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        System.out.println(hpCon==null);


        //получить дату
        long d = hpCon.getDate();
        if (d==0)
            System.out.println("Сведения о дате отсутствуют");
        else
            System.out.println("дата: " + new Date(d));

        //получить тип содержимого
        System.out.println("Тип содержимого: " + hpCon.getContentType());

        //получить дату срока дейтсвия ресурса
        d = hpCon.getExpiration();
        if (d==0)
            System.out.println("Сведения о сроке действия отсутсвуют.");
        else
            System.out.println("Срок действия истекает: " + new Date(d));

        //получить дату послвденей модификации
        d = hpCon.getLastModified();
        if (d==0)
            System.out.println("Сведения о дате последней модификации отсутствуют.");
        else
            System.out.println("Дата последней модификации: " + new Date(d));

        //получить длину содержимого
        long len = hpCon.getContentLengthLong();
        if (len==-1)
            System.out.println("Длина содкржимого недоступна");
        else
            System.out.println("Длина содержимого: " + len);

        if (len !=-1) {
            System.out.println("=== Содержимое ===");
            InputStream inputStream = hpCon.getInputStream();
            while ((c=inputStream.read()) !=-1 ){
                System.out.print((char)c);
            }
            inputStream.close();
        } else {
            System.out.println("Содержимое недоступно");
        }
    }
}
