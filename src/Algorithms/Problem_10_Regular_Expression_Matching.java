package Algorithms;

public class Problem_10_Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {
        if (null == s || null == p) return false;
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int j = 0; j < p.length(); j++) {
            if (0 < j && p.charAt(j) == '*' && dp[0][j - 1])
                dp[0][j + 1] = dp[0][j - 1];
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == s.charAt(i))
                    dp[i + 1][j + 1] = dp[i][j];
                if ('.' == p.charAt(j))
                    dp[i + 1][j + 1] = dp[i][j];
                if ('*' == p.charAt(j)) {
                    if (p.charAt(j - 1) != s.charAt(i) && '.' != p.charAt(j - 1))
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    else
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
