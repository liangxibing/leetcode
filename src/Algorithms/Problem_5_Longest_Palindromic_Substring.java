package Algorithms;

public class Problem_5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        String result = "";
        String tmp;
        for (int i = 0; i < s.length() - 1; i++) {
            tmp = longestPalindromeOnIndex(s, i);
            if (result.length() < tmp.length()) result = tmp;
        }
        return result;
    }

    private String longestPalindromeOnIndex(String s, int index) {
        String s1 = longestPalindromeOnStartEndIndex(s, index, index);
        String s2 = longestPalindromeOnStartEndIndex(s, index, index + 1);
        return s1.length() < s2.length() ? s2 : s1;
    }

    private String longestPalindromeOnStartEndIndex(String s, int start, int end) {
        String result = s.substring(start, start + 1);
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                result = s.substring(start, end + 1);
                start--;
                end++;
                continue;
            }
            break;
        }
        return result;
    }
}
