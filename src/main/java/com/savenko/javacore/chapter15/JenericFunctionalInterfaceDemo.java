package com.savenko.javacore.chapter15;

public class JenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //использовать строковый вариант интерфецса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >=0 ; i--) {
                result += str.charAt(i);
            }

            return result;
        };
        System.out.println("Ламбда обращается на " + reverse.func("Лямбда"));

        SomeFunc<Integer> factorial = (n) ->{
          int result = 1;
            for (int i = 1; i <= n ; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Факториал 5 равен " + factorial.func(5));
    }
}
