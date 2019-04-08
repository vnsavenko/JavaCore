package com.savenko.javacore.chapter15;

public class BlockLambdsaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
          int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

          return result;
        };

        System.out.println("" + factorial.func(5));
        System.out.println("" + factorial.func(2));
    }
}
