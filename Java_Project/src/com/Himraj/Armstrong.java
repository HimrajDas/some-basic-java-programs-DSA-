package com.Himraj;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want check: ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int originalValue = n;
        int sum = 0;
        while (n > 0) {
            int reminder = n % 10;
            n /= 10;
            // sum += reminder * reminder * reminder;
            sum += (int) Math.pow(reminder, String.valueOf(originalValue).length());
        }
        return sum == originalValue;
    }
}
