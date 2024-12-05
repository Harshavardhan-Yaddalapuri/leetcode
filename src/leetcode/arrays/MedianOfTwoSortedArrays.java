package leetcode.arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int n = nums1.length; // Length of the first array
        int m = nums2.length; // Length of the second array
        int[] sorted = new int[n + m]; // Array to hold the merged and sorted elements
        int i = 0, j = 0, k = 0; // Pointers for nums1, nums2, and sorted arrays
        int l = sorted.length; // Total length of the merged array

        // Merge the two arrays into the sorted array
        while (k < l) {
            if (i < n && (j >= m || nums1[i] < nums2[j])) {
                sorted[k++] = nums1[i++]; // Add element from nums1 to sorted
            } else {
                sorted[k++] = nums2[j++]; // Add element from nums2 to sorted
            }
        }

        // Calculate the median
        if (l % 2 == 0) {
            // If the length is even, the median is the average of the two middle elements
            median = (double) (sorted[l / 2 - 1] + sorted[l / 2]) / 2;
        } else {
            // If the length is odd, the median is the middle element
            median = sorted[l / 2];
        }

        return median; // Return the calculated median
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        System.out.println(m.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})); // Example usage
    }
}