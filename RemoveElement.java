public class RemoveElement {

    /**
     * Remove Element
     * https://leetcode.com/problems/remove-element/
     */
    public int removeElement(int[] nums, int val) {
        
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
