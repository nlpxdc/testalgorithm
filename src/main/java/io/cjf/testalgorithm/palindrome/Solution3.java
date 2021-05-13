package io.cjf.testalgorithm.palindrome;


public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        boolean a = solution.judge("a");
        boolean aa = solution.judge("aa");
        boolean aba = solution.judge("aba");
        boolean abba = solution.judge("abba");
        boolean abcba = solution.judge("abcba");
        boolean abc = solution.judge("abc");
    }

    public boolean judge (String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char leftChar = chars[left];
            char rightChar = chars[right];
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}