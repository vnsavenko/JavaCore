package com.savenko.javacore.chapter09.inerfaces;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Объект типа String по умолчанию";
    }
}
class MyIFImp implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }
}
class DefaultMethDemo{
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
    }
}