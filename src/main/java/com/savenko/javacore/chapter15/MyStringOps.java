package com.savenko.javacore.chapter15;

//продемострировать ссылку на статический метод
public class MyStringOps {

    static String strReverse(String str) {
        String res = "";
        int i;
        for (i = str.length()-1; i>=0;i--){
            res+= str.charAt(i);
        }
        return res;
    }
}
