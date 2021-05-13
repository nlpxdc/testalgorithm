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
        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            char t = chars[left];
            chars[left] = chars[right];
            chars[right] = t;
        }
        return new String(chars);
    }
}
