package com.Himraj;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {20, 14, 54, 30, 2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
