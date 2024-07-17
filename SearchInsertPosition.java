public class SearchInsertPosition {
    
    /**
     * Search Insert Position
     * https://leetcode.com/problems/search-insert-position/
     */
    public int searchInsert(int[] nums, int target) {

        int i;
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return i;
    }
}
