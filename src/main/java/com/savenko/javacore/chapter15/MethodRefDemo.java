package com.savenko.javacore.chapter15;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        //Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);

    }
}
