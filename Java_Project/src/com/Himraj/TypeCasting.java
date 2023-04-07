package com.Himraj;

public class TypeCasting {
    public static void main(String[] args) {

        // type casting.
        // int num = (int)(66.76f);
        // System.out.println(num);

        // automatic type promotion in expression.
        // int a = 257;
        // byte b = (byte) (a);   // 257 % 256 = 1    (256 is max value of byte)
        //System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - ( d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);



    }
}
