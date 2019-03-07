package com.savenko.javacore.chapter09.inerfaces.stack;

public interface IntStack {
    void push(int item);//сохранить в стек
    int pop();          //извлеч из стека элемент
    /* У метода clear() теперь имеется вариант по умолчанию, поэтому
     его придется реализовать в том существующем классе, где уже
     применяется интерфейс IntStack
    */
    default void clear(){
        System.out.println("Метод clear()  не реализован");
            }
}

