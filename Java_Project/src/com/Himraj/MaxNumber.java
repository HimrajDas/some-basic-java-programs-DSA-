package com.Himraj;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {12, 50, 340, 20, 669};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
