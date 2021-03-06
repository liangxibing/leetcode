package Algorithms;

public class Problem_38_Count_And_Say {
    public String countAndSay(int n) {
        if (1 == n) return "1";

        char[] prev = countAndSay(n - 1).toCharArray();
        int i = 0;
        int count = 1;
        StringBuilder output = new StringBuilder();
        while (i < prev.length - 1) {
            if (prev[i] == prev[i + 1]) {
                count++;
                i++;
                continue;
            }
            output.append(count).append(prev[i]);
            count = 1;
            i++;
        }
        output.append(count).append(prev[i]);

        return output.toString();
    }
}
