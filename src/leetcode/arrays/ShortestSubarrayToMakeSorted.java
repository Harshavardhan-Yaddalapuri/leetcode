package leetcode.arrays;

public class ShortestSubarrayToMakeSorted {
    public int findLengthOfShortestSubarray(int[] arr) {
        int current_window = 0;
        int left = 0, right = 1;
        int prefix = 0;
        int postfix = 0;

        while (right < arr.length - 1){
            if(arr[left] < arr[right]){
                left++;
                right++;
                postfix = arr[right];
            } else{
                prefix = arr[left];
                current_window = right - left;

                right++;
            }

        }
        return current_window;
    }

    public static void main(String[] args) {
        ShortestSubarrayToMakeSorted s = new ShortestSubarrayToMakeSorted();
        System.out.println(s.findLengthOfShortestSubarray(new int[]{1,2,3,10,4,2,3,5}));
    }
}
