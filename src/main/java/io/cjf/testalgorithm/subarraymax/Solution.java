package io.cjf.testalgorithm.subarraymax;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};

        int maxsum = new Solution().maxsumofSubarray(arr);
    }

    /**
     * max sum of the subarray
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    //with index
    public int maxsumofSubarray3(int[] arr) {
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int t = 0;
                for (int k = i; k < j; k++) {
                    t += arr[k];
                }
                if (t > maxsum) {
                    maxsum = t;
                    System.out.println(String.format("maxsum: %s, i: %s, j: %s", maxsum, i, j - 1));
                }
            }
        }
        return maxsum;
    }

    //with index
    public int maxsumofSubarray2(int[] arr) {
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int t = 0;
            for (int j = i; j < arr.length; j++) {
                t += arr[j];
                if (t > maxsum) {
                    maxsum = t;
                    System.out.println(String.format("maxsum: %s, i: %s, j: %s", maxsum, i, j));
                }
            }

        }
        return maxsum;
    }

    //without index i
    public int maxsumofSubarray(int[] arr) {
        int t = arr[0];
        int maxsum = arr[0];
        int first = 0;
        int last = 0;
        for (int i = 1; i < arr.length; i++) {
            t += arr[i];
            if (t < 0) {
                t = 0;
                first = i + 1;
                System.out.println(String.format("i: %s", first));
            }
            if (maxsum < t) {
                maxsum = t;
                last = i;
                System.out.println(String.format("maxsum: %s, j: %s",  maxsum, last));
            }
        }
        return maxsum;
    }

}
