package com.Himraj;

import java.util.Arrays;

public class SwapV2 {
    public static void main(String[] args) {
        int[] arr = {10, 35, 30, 2, 9};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
