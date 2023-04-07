package com.Himraj;

public class Reverse {
    public static void main(String[] args) {
        int num = 6376476;
        int ans = 0;
        while (num > 0) {
            int reminder = num % 10;
            num /= 10;
            ans = ans * 10 + reminder;
        }

        System.out.println(ans);
    }
}
