package com.vedanth;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("*Program to print factorial of a number*");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact = 1 ;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);


    }
}
