package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Problem_13_Roman_To_Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                if ((('I' == current) && (('V' == next) || ('X' == next)))
                        || (('X' == current) && (('L' == next) || ('C' == next)))
                        || (('C' == current) && (('D' == next) || ('M' == next)))) {
                    sum += symbol.get(next) - symbol.get(current);
                    i++;
                    continue;
                }
            }
            sum += symbol.get(current);
        }
        return sum;
    }
}
