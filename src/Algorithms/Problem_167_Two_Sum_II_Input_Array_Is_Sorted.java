package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Problem_167_Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> value_map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < (target / 2))
                value_map.put(numbers[i], i);
            Integer value = value_map.get(target - numbers[i]);
            if (null != value)
                return new int[] {value + 1 , i + 1};
            value_map.put(numbers[i], i);
        }
        return null;
    }
}
