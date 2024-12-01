package leetcode.arrays;

import java.util.Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int left = 0;
        int right = 1;
        int n = temperatures.length;

        while (right < n){

            if(temperatures[left] < temperatures[right]) {
                temperatures[left] = right - left;
                left++;
                right = left + 1;
            }else {
                if(right == n - 1){
                    temperatures[left] = 0;
                    left++;
                    right = left;
                }
                right++;
            }
        }

        // if(temperatures[n - 2] >= temperatures[n - 1]){
        //     temperatures[n - 2] = 0;
        // }
        temperatures[n - 1] = 0;

        return temperatures;
        }

    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(new int[]{55,38,53,81,61,93,97,32,43,78})));
    }
}
