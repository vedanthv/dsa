package com.vedanth;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("******* Even or Odd Number Checking *********");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + " is Even");
        }
        else
            System.out.println(num +  " is Odd");
    }
}
