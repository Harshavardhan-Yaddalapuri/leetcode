package leetcode.arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;


        while(left < right){
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        if(nums[left] > target)
            return left;
        else
            return mid;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7));
    }

}
