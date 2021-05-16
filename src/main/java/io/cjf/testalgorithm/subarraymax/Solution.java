package io.cjf.testalgorithm.subarraymax;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};

        int maxsum = new Solution().maxsumofSubarray(arr);
    }

    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int t = 0;
                for (int k = i; k < j; k++) {
                    t += arr[k];
                }
                if (t > maxsum) {
                    maxsum = t;
                }
            }
        }
        return maxsum;
    }

}
