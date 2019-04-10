package com.savenko.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        // поизвести сериализацию объекта
        try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial")) ){

            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e){
            System.out.println("Исключение при сериализации: " + e);
        }

        // произвести десериализацию объекта

        try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass)objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e){
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }


    }
}
