/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if (j < 0) {
                return;
            }

            if (i < 0 || nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
    }
}