package com.savenko.javacore.chapter18;

import java.util.LinkedList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + " " + state + " " + code;
    }
}

class MailList{
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61601"));
        ml.add(new Address("Ralf Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        for (Address address: ml
             ) {
            System.out.println(address + "\n");
        }

        System.out.println();



    }
}
