package Algorithms;

public class Problem_9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int left = x;
        int reverse = 0;
        while (left != 0) {
            reverse *= 10;
            reverse += left % 10;
            left /= 10;
        }
        return reverse == x;
    }
}
