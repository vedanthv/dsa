package com.vedanth;

import java.util.Scanner;

public class Maxtill0 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int max = number;
        while((number = in.nextInt()) != 0){
            if(number > max){
                max = number;
            }
        }
        System.out.println("Max is "+ max);

    }
}
