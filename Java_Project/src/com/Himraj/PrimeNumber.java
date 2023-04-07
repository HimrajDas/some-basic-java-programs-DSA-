package com.Himraj;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean ans = checkPrime(num);
        System.out.println(ans);

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int x = 2;
        while (x * x <= n) {
            if (n % x == 0) {
                return false;
            }
            x++;
        }
        return x * x > n;
    }

    static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
