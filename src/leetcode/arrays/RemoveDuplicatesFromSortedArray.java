package leetcode.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;

        while(right < nums.length){
            if(nums[left] == nums[right]){
                right++;
            }else {
                nums[++left] = nums[right];
            }
        }

        return left + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicates(nums));
    }
}
