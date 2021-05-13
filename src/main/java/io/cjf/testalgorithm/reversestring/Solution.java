package io.cjf.testalgorithm.reversestring;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String reverseStr = solution.solve("abcdefg");
    }
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        char[] reverseChars = new char[chars.length];
        for (int i = 0; i < reverseChars.length; i++) {
            reverseChars[i] = stack.pop();
        }
        String reverseStr = new String(reverseChars);
        return reverseStr;
    }
}
