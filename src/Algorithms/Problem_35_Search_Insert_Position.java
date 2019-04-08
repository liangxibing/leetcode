package Algorithms;

public class Problem_35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        if (null == nums || 0 == nums.length) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i])
                return i;
        }
        return nums.length;
    }
}
