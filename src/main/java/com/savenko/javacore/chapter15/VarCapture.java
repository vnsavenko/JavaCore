package com.savenko.javacore.chapter15;
// пример захвата переменной из объемлющей области действия
public class VarCapture {
    public static void main(String[] args) {
        //локальная переменная, которая мжет быть захвачена
        int num = 10;
        NumericFunc numericFunc = (n)->{
            int v = num + n;
            //num++;
        return v;
        };

        //num = 9;
    }
}
