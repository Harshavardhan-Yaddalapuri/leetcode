package leetcode.arrays;

import java.util.Arrays;

public class MissingNumber {
    int missingNumber(int arr[]) {
/*        *//* Inefficient approach Time -> O(n log n) and space O(1) *//*
        int n = arr.length;
        int i;
        Arrays.sort(arr);
        for(i = 1; i <= n; i++){
            if(arr[i-1] != i){
                break;
            }
        }
        return i; */

        /* Efficient approach Time -> O(n) and space O(1) */
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        for (int i : arr) {
            sum -= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1, 2, 3, 5}));
    }
}
