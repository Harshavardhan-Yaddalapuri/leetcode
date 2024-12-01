package gfg_dsa_160.arrays;

import java.util.Arrays;

public class RotateArrayToLeft {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here

        int n = arr.length;

            d %= n;
            rotate(arr, 0, d - 1);
            rotate(arr, d, n - 1);
            rotate(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int arr[], int left, int right){
        while (left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        RotateArrayToLeft.rotateArr(new int[]{1,2,3,4,5,6,7}, 3);
    }

}
