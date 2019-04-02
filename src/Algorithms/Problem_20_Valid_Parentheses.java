package Algorithms;

import java.util.Stack;

public class Problem_20_Valid_Parentheses {
    public boolean isValid(String s) {
        if (null == s || 0 == s.length())
            return true;
        Stack<Character> char_stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (is_left_bracket(c)) {
                char_stack.push(c);
                continue;
            }
            if (char_stack.empty() || !match_bracket(char_stack.peek(), c))
                return false;
            char_stack.pop();
        }
        return char_stack.empty();
    }

    private boolean match_bracket(Character a, Character b) {
        return (a.equals('(') && b.equals(')'))
                || (a.equals('{') && b.equals('}'))
                || (a.equals('[') && b.equals(']'));
    }

    private boolean is_left_bracket(char c) {
        return '(' == c || '{' == c || '[' == c;
    }
}
