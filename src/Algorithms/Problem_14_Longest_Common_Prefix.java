package Algorithms;

public class Problem_14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || 0 == strs.length) return "";
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            for (String str : strs) {
                if (null == str || str.length() < i + 1 || str.charAt(i) != first.charAt(i))
                    return i > 0 ? first.substring(0, i) : "";
            }
        }
        return first;
    }
}
