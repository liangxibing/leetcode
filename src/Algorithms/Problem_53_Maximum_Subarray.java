package Algorithms;

public class Problem_53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;
        int sum = nums[0] < 0 ? 0 : nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            // if the new sub sum is larger than the original max sum, replace the max sum
            if (sum > max_sum)
                max_sum = sum;
            // if the new sub sum is less than 0, begin the calculation on sub sum from next position
            if (sum < 0)
                sum = 0;
        }
        return max_sum;
    }
}
