package Algorithms;

/**
 * Created by liangxibing on 2019-04-03.
 */
public class Problem_26_Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[result++] = nums[i + 1];
            }
        }
        return result;
    }
}
