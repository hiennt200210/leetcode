public class RemoveDuplicatesFromSortedArray {
    
    public void test() {

        int[] nums1 =  {1, 1, 2};
        if (removeDuplicates(nums1) == 2) {
            System.out.println("Case 1: Pass");
        } else {
            System.out.println("Case 1: Fail");
        }

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        if (removeDuplicates(nums2) == 5) {
            System.out.println("Case 2: Pass");
        } else {
            System.out.println("Case 2: Fail");
        }
    }

    /**
     * Remove Duplicates from Sorted Array
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public int removeDuplicates(int[] nums) {

        int uniqueCount = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount]) {
                uniqueCount++;
                nums[uniqueCount] = nums[i];
            }
        }

        return uniqueCount + 1;
    }
}
