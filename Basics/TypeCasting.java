package com.vedanth;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat(); //even if we input integer it gets converted to float
        System.out.println(num);

        //Type Casting
        //Narrow type casting
        int no = (int)(67.56f);
        System.out.println(no);

        //automatic type promotion in expression
        int a = 257; //range of one byte is 256
        byte b = (byte)(a);

        System.out.println(b);

    }
}
