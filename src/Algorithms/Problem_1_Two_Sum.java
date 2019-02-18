package Algorithms;

import java.util.HashMap;
import java.util.Map;

class Problem_1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> value_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = value_map.get(target - nums[i]);
            if (null != value)
                return new int[] {value , i};
            value_map.put(nums[i], i);
        }
        return null;
    }
}