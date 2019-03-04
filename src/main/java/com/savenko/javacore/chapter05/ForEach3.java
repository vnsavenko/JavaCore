package com.savenko.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int [3][5];

        // присвоить значение элементам массива nums
        for(int i = 0 ; i < 3;i++)
            for (int j = 0 ;j < 5 ; j++)
                nums[i][j] = (i+1)*(j+1);

            //используем foreach для вывода и суммирования
        for (int x[]:nums) {
            for (int y: x
                 ) {
                System.out.println("Значение равно: " + y);
                sum +=y;
            }
        }
        System.out.println("Сумма равна: " + sum);

        }
}
