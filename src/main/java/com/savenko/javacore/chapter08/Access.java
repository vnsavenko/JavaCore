package com.savenko.javacore.chapter08;
/* В иерархии классов закрытые члены остаются закрытыми
в пределах своего класса
*/
public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);

    }
}

class A1 {
    int i;
    private int j;
    void  setij(int x, int y){
        i = x;
        j = y;
    }
    int getJ(){
        return j;
    }
}

class B1 extends A1 {
    int total;
    void sum(){
        //total = i + j;
    }
}

