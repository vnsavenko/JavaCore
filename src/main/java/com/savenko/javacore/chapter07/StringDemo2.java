package com.savenko.javacore.chapter07;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;
        String strOb4 = "Первая строка";
        System.out.println("Длинна строки strOb1: " + strOb1.length());

        System.out.println("char at index 3 in strOb1 " + strOb1.charAt(3));
        if (strOb1.equals(strOb2)) System.out.println("strOb1 == strOb2" + " " + strOb1 == strOb2);
        else
            System.out.println("strOb1 != strOb2");

        if (strOb1.equals(strOb3)) System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");

        if (strOb4.equals(strOb1)) System.out.println("strOb4 == strOb1");
            else System.out.println("strOb4 != strOb1");

    }
}
