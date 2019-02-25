package Algorithms;

public class Problem_7_Reverse_Integer {
    public int reverse(int x) {
        int bit = 0;
        int left = x;
        while (left != 0) {
            if (bit > Integer.MAX_VALUE/10 || (bit == Integer.MAX_VALUE / 10 && (left % 10) > 7)) return 0;
            if (bit < Integer.MIN_VALUE/10 || (bit == Integer.MIN_VALUE / 10 && (left % 10) < -8)) return 0;
            bit = bit * 10;
            bit += left % 10;
            left = left / 10;
        }
        return bit;
    }
}
