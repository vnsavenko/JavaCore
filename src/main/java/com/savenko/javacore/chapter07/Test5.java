package com.savenko.javacore.chapter07;

public class Test5 {
    int a;              // default
    public int b;       // open
    private int c;      // closed

    void setc(int i){
        c = i;
    }

    int getc(){
        return c;
    }
}

class AccessTest{
    public static void main(String[] args) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;
        // ob.c = 100; Доступ закрыт

        ob.setc(100);
        System.out.println("a, b, c : " + ob.a + " " + ob.b +" "+ ob.getc());


    }
}
