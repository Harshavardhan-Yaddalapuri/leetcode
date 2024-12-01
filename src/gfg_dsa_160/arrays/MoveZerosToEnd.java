package gfg_dsa_160.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here

        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < arr.length){
            arr[count++] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        MoveZerosToEnd m = new MoveZerosToEnd();
        m.pushZerosToEnd(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
    }

}
