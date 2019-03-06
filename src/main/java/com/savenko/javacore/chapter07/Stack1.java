package com.savenko.javacore.chapter07;

public class Stack1 {
    private int stack[];
    private int tos;

    public Stack1(int size) {
        stack = new int[size];
        tos = - 1;
    }
    void push(int item){
        if (tos == stack.length-1) System.out.println("Stack is filled");
        else
            stack[++tos] = item;
    }

    int pop(){
        if (tos<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stack[tos--];
    }
}

class TestStack2{
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1(5);
        Stack1 stack2 = new Stack1(8);

        for (int i = 0; i < 5; i++) stack1.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        System.out.println("Stack in stack1: ");
        for (int i = 0; i < 5; i++) System.out.println(stack1.pop());

        System.out.println("Stack in stack2: ");
        for (int i = 0; i < 8; i++) System.out.println(stack2.pop());
    }
}

