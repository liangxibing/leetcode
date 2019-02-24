package Algorithms;

import java.util.*;

public class Problem_15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (null == nums) return null;
        List<List<Integer>> result = new LinkedList<>();
        if (2 >= nums.length) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            find_two_sum(-nums[i], nums, i + 1, result);
        }
        return result;
    }

    private void find_two_sum(int target, int[] nums, int index, List<List<Integer>> result) {
        Map<Integer, Integer> value_map = new HashMap<>();
        for (int i = index; i < nums.length; i++) {
            Integer value = value_map.get(target - nums[i]);
            if (null != value) {
                value_map.remove(target - nums[i]);
                List<Integer> triplet = new LinkedList<>();
                triplet.add(-target);
                triplet.add(target - nums[i]);
                triplet.add(nums[i]);
                result.add(triplet);
            }
            if (i == index || nums[i] != nums[i - 1]) value_map.put(nums[i], i);
        }
    }
}
