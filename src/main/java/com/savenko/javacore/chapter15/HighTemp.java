package com.savenko.javacore.chapter15;

public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    // метод, возвр тру если т-ры равны
    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    // метод возвр тру если т-ра меньше, чем у сравниваемой
    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
