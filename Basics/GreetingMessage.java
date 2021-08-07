package com.vedanth;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println("******* Greeting Message ********");
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);

        String name = in.next();

        System.out.println("Good morning "+name);
    }
}
