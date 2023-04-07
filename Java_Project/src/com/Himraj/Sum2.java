package com.Himraj;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = sum(num1, num2);
        System.out.println(ans);
    }

//    static int sum() {
//         Scanner in = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = in.nextInt();
//        return num1 + num2;
//
//    }

    static int sum(int a, int b) {
        return a + b;
    }
}
