package leetcode.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length){
            if(nums[right] != val){
                nums[left++] = nums[right++];
                count++;
            } else
                right++;
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(re.removeElement(nums, val));
    }
}
