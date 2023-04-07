package com.Himraj;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int count = 2;
        int n = sc.nextInt();

        while (count <= n) {
            int tempVar = b;
            b = b + a;
            a = tempVar;
            count++;
        }

        System.out.println(b);
    }
}
