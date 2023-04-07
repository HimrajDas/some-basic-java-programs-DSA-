package com.Himraj;

public class CountNumbers {
    public static void main(String[] args) {
        int n = 45655875;
        int count = 0;
        while (n > 0) {
            int reminder = n % 10;
            if (reminder == 5) {
                count++;
            }
            n /= 10;
        }

        System.out.println(count);
    }
}
