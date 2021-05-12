package io.cjf.testalgorithm.palindrome;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean a = solution.judge("a");
        boolean aa = solution.judge("aa");
        boolean aba = solution.judge("aba");
        boolean abba = solution.judge("abba");
        boolean abcba = solution.judge("abcba");
        boolean abc = solution.judge("abc");
    }

    public boolean judge (String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (chars.length % 2 == 0 || i != chars.length / 2) {
                if (stack.empty()) {
                    stack.push(c);
                } else {
                    Character t = stack.peek();
                    if (c == t) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
        }
        return stack.empty();
    }
}