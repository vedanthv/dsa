package com.vedanth;

import java.util.Scanner;

public class Sumtill0 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        while((num = in.nextInt()) != 0){
            sum = sum + num;
        }
        System.out.println("Sum is "+ sum);

    }
}
