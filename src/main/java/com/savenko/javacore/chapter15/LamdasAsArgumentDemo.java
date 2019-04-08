package com.savenko.javacore.chapter15;

public class LamdasAsArgumentDemo {

    //первый параметр - тип функциональный ифейс, следовательно
    // ему можно передать ссылку на любой экземпляр этого ифейса,
    // в т ч и лямбда выражение

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        //передается простое лямбда выражение
        outStr = stringOp((str)-> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        //передается блочное лямбда выражение
        outStr = stringOp((str)->{
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Это строка с удаленными пробелами: " + outStr);

        StringFunc reverse = (str)->{
            String res = "";
            int i;
            for (i = str.length()-1; i>=0;i--){
                res+=str.charAt(i);
            }
            return res;
        };

        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));

    }
}
