package com.savenko.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;

        } catch (ArithmeticException e) {
            System.out.println("Перехват исключения общего класса Exception.");
        }
        /* Этот оператор catch вообще не будет достигнут, т.к.
        подкласс ArithmeticException яввляется производным
        от класса Exception
         */
        catch (Exception e) {//ОШИБКА: недостижимый код!
            System.out.println("Этот код вообще недостижим");
        }
    }
}
