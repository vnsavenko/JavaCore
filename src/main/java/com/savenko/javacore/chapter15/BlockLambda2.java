package com.savenko.javacore.chapter15;

public class BlockLambda2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() -1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбда обращается: " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается: " + reverse.func("Выражение"));
    }
}
