package com.savenko.javacore.chapter18;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//сравнить последние слова в обеих символьных строках
public class TComp implements Comparator<String> {
    public int compare(String a, String b){
        int i, j, k;

        //найти индекс символа, с которого начинается фамилия

        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        k = a.substring(i).compareTo(b.substring(j));
        if(k==0) //фамилии совпадают, проверить имя и фамилию полностью (строку полностью)
        return a.compareTo(b);
        else return k;
    }
    // переопределять equals() не надо
}

class TreeMapDemo2{
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //ПОлучить множество элементов

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести элементы из множества
        for (Map.Entry<String,Double> me: set
             ) {
            System.out.print((me.getKey()) + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести 1000 на счет Джона Доу
        double bal = tm.get("Джон Доу");
        tm.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " +
                tm.get("Джон Доу"));

    }
}
