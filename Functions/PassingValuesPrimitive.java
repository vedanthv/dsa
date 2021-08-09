package com.vedanth;

public class PassingValuesPrimitive {
    public static void main(String[] args) {
        String name = "Vedanth";
        System.out.println(changeName(name));

    }

     static String changeName(String naam) {
        naam = "Rahul";
        return naam;
    }
}
