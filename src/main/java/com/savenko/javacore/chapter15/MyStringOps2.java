package com.savenko.javacore.chapter15;

public class MyStringOps2 {


    String strReverse(String str) {
        String res = "";
        int i;
        for (i = str.length()-1; i>=0;i--){
            res+= str.charAt(i);
        }
        return res;
    }

    String ddd(){
        return " sdsd ";
    }
}
