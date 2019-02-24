package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Problem_3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()) return 0;
        Map<Character, Integer> char_location = new HashMap<>();
        int max_length = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            /* If there is the same char between start and current location,
             * then current substring stops, and mark the next element of
             * previous location of this char as start location
             */
            if (char_location.containsKey(cur) && char_location.get(cur) >= start) {
                max_length = Math.max(max_length, i - start);
                start = char_location.get(cur) + 1;
            }
            char_location.put(cur, i);
        }
        max_length = Math.max(max_length, s.length() - start);
        return max_length;
    }
}
