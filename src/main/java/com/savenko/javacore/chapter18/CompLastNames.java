package com.savenko.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompLastNames implements Comparator<String> {
    public int compare(String a, String b){
        int i, j;

        //найти индекс символа, с которого начинается фамилия
        i = a.lastIndexOf(' ');
        j = a.lastIndexOf(' ');
        return a.substring(i).compareTo(b.substring(j));
    }
}

//отсортировать счета вкладчиков по ФИО, если фамилии одинаковы
class CompareThenByFirstName implements Comparator<String>{
    public int compare(String a, String b){

        return a.compareTo(b);
    }
}

class TreeMapDemo2A{
    public static void main(String[] args) {
        //использовать метод thenComparing() для создания
        //компаратора, сравнивающего сначала фамилии, а затем
        //ФИО вкладчиков, если фамилии одинаковы

        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompareThenByFirstName());

        //Создать дерево

        TreeMap<String,Double> tm = new TreeMap<>(compLastThenFirst);



        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String,Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> el : set
             ) {
            System.out.print(el.getKey() + ": ");
            System.out.println(el.getValue());
        }
        System.out.println();

        //внести 1000 на счет Джона Доу
        double bal = tm.get("Джон Доу");
        tm.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " +
                tm.get("Джон Доу"));




    }
}