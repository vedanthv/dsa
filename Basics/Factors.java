package com.vedanth;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("******Factors of a number**********");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        for(int i = 2;i <=num;i++){
            if(num % i == 0){
                System.out.println("One factor is " + i);
            }
        }
    }
}
