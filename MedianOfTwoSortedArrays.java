import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        int totalLength = m + n;
        if (totalLength % 2 == 0) {
            int mid1 = totalLength / 2 - 1;
            int mid2 = totalLength / 2;
            return (merged[mid1] + merged[mid2]) / 2.0;
        } else {
            int mid = totalLength / 2;
            return merged[mid];
        }
    }
}

