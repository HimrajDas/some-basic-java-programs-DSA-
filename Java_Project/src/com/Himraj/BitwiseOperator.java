package com.Himraj;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
//        System.out.println(findUnique(arr));
        // int ans = magicNumber(6);
        // System.out.println(noOfDigits(6));
        // System.out.println(powerOf2(8));
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        int p = sc.nextInt();
//        System.out.println(power(b, p));

        // See any binary form of a number.
        //System.out.println(Integer.toBinaryString(7));


        // range for a, b = xor(b) ^ xor(a - 1)
        int a = 3;
        int b = 9;
        int ans = rangeXOR(b) ^ rangeXOR(a - 1);
        System.out.println(ans);
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    static int findUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) unique ^= n;
        return unique;
    }


    static int magicNumber(int n) {
        // Amazon question.
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int lastDigit = n & 1;
            n = n >> 1;
            ans += lastDigit * base;
            base = base * 5;
        }

        return ans;
    }

    static int noOfDigits(int n) {
        int b = 2;
        return (int) (Math.log(n) / Math.log(b)) + 1;
    }

    static boolean powerOf2(int n) {
        if (n == 0) return false;
        return (n & (n - 1)) == 0;
    }

    static int power(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) ans *= base;
            base *= base;
            power = power >> 1;
        }

        return ans;
    }


    static int noOfSetBits() {
        int n = 9;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }

        return count;
    }


    static int rangeXOR(int a) {
        // this gives xor from 0 to a
        if (a % 4 == 0) return a;
        if (a % 4 == 1) return 1;
        if (a % 4 == 2) return a + 1;
        return 0;
    }



}
