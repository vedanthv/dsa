package com.vedanth;

public class AutomaticTypeCasting {
    public static void main(String[] args) {
        //automatic type promotion in expression
        int a = 257; //range of one byte is 256
        byte b = (byte)(a);
        //b = 257 % 256 = 1 (value / maximum value)
        System.out.println(b); //output is 1 because we can't store 257 in the byte variable its maximum
        //value is 256

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e; //when evaluating c * d Java automatically promotes from byte to int
        System.out.println(f);

        int num = 'a';
        System.out.println(num);

        //One proper example to solidify the concepts

        byte x = 42;
        char y = 'a';
        short s = 1024;
        int i = 50000;
        float t = 5.67f;
        double z = 0.1234;
        double result = (t * x) + (i / y) - (z - s);
        //float + integer - double = double (maximum one is double. Biggest one is double)
        System.out.println((t * x) + " " +  (i / y) + " " + (z - s));
        System.out.println(result);
    }
}
