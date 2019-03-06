package com.savenko.javacore.chapter07;
// recursion
public class Factorial {
    // recursive method
    int fact(int n){
        int res;

        if(n==1) return 1;
        res = fact(n-1) * n;
        System.out.println("step " + n);
        return res;
    }
}

class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();

        //System.out.println("Factorial 3 equals " + f.fact(3));
        //System.out.println("Factorial 4 equals " + f.fact(4));
        System.out.println("Factorial 5 equals " + f.fact(5));
    }
}
