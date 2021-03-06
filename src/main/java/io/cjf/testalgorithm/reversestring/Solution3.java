package io.cjf.testalgorithm.reversestring;


public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String reverseStr = solution.solve("abcdefg");
    }
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        char[] chars = str.toCharArray();
        char[] reverseChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverseChars[chars.length - i - 1] = chars[i];
        }
        return new String(reverseChars);
    }
}
