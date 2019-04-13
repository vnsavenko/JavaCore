package com.savenko.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        // создать список объектов типа Integer

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        //два способа получения результата перемножения целочисленных
        // элементов списка с помощью метода reduce()

        Optional<Integer> productObj= list.stream().reduce((a, b) -> a*b);
        if (productObj.isPresent()) System.out.println("Произведение в виде объекта типа Optional: " +
                productObj.get());

        int product = list.stream().reduce(1, (a, b)-> a * b);
        System.out.println("ПРоизведение в виде значения тип int: " + product);

    }

}
