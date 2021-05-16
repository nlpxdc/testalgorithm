package io.cjf.testalgorithm.sort.mergesort;

public class Solution {

    public static void main(String[] args) {
        int[] left = {1, 3, 5, 7};
        int[] right = {2, 4, 6, 8};

        Solution solution = new Solution();
        int[] merge = solution.merge(left, right);

    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;

        int c = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[c] = left[i];
                i++;
            } else {
                result[c] = right[j];
                j++;
            }
            c++;
        }

        while (i < left.length)  {
            result[c] = left[i];
            i++;
        }

        while (j < right.length) {
            result[c] = right[j];
            j++;
        }

        return result;
    }

}
