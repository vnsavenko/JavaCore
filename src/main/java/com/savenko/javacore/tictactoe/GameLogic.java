package com.savenko.javacore.tictactoe;

import java.util.Scanner;

public class GameLogic {

    public static int MOVE = 0;//счетчику ходов

    private int[] getCoordinates(){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        return new int[]{i1, i2};

    }

    private boolean checkWinner(Field f) {

        //int[] checksum = new int[9];
        int[][] board = f.getBoard();
        int diag = 0;//сумма в гл диагонали
        int otherdiag = 0;//сумма в другой диагонали

        for (int i = 0; i < 3; i++) {

            int sum = 0;// сумма значений в столбцах
            int str = 0;// сумма значений в строках

            for (int j = 0; j < 3; j++) {
                sum+= board[j][i];//сумма столбцов
                str+= board[i][j];//сумма строк
                if (i == j ) diag+= board[i][j];//сумма главной диагонали
                if (i + j == 2) otherdiag+= board[i][j];// сумма другой диагонали

            }

            if((sum == 9)||(sum==0)||(str==9)||(str==0))
                return true;
        }
        if((diag==9)||(diag==0)||(otherdiag==9)||(otherdiag==0)) return true;

        return false;
    }


    public void playGame(){
        System.out.println("Привет. Вы играете крестиками.");
        Field f = new Field(); //создаем игровое поле
        f.drawField();//рисуем его
        boolean cond = true;//условие отсутствия выигрышной комбинации
        String s;
        do
        {

            //pcMove();
            //humanMove();
            //drawField();
            //checkWinner();

            s = (GameLogic.MOVE+1)%2==0 ? "X": "O";//
            System.out.println("Сейчас ход: " + s);
            System.out.println("Введите коорд пустой клетки в виде пары чисел, разделенных пробелом");
            int[] xy = getCoordinates();
            if (f.getItem(xy[0], xy[1])!=-1){
                System.out.println("Клетка с координатами " + xy[0] + " и " + xy[1] +
                        " заполнена, попытайтесь еще");
                continue;
            }

            f.setItem(xy[0], xy[1], (++GameLogic.MOVE%2==0)? Field.CROSS : Field.ZERO);
            f.drawField();
            cond = checkWinner(f);

            //System.out.println(GameLogic.TURN);


        } while(!cond&&GameLogic.MOVE<9);
        System.out.println("Выиграли " + " "+ s);
    }





/*
-2 создаем доску
-1 отрисовываем доску
выводим сообщение, что первыми ходят крестики,
в цикле:
0.  просим ввести координаты ячейки для крестика
1. принимаем с клавиатуры координаты, проверяем, что ячейка пуста, ставим крестик. Если непуста, сообщаем об это и шаг 1.
2. отрисовываем доску
3.  просим ввести координаты ячейки для крестика
4. принимаем с клавиатуры координаты, проверяем, что ячейка пуста, ставим крестик. Если непуста, сообщаем об это и шаг 3.
5. отрисовываем доску.
6. проверяем доску на выигрыш. если да то выводим кто выиграл. переходим к шагу 8
7 проверяем доску на количество свободных мест. если их нет и выигрыш не состоялся, то выводим сообщение о ничье
8. спрашиваем, играть ли заново, если да, то на шаг "-2", если нет, то выход


  */

}
