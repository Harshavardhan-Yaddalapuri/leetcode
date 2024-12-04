package leetcode.arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int n = nums1.length;
        int m = nums2.length;
        int[] sorted = new int[n+m];
        int i = 0, j = 0, k = 0;
        int l = sorted.length;
        while(k < l){
            if(i < n && (j >= m || nums1[i] < nums2[j])){
                sorted[k++] = nums1[i++];
            } else {
                sorted[k++] = nums2[j++];
            }
        }



        if( l % 2 == 0){
            median = (double) (sorted[l / 2 - 1] + sorted[l / 2]) / 2 ;
        } else{
            median = sorted[l / 2];
        }

        return median;

    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        System.out.println(m.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
