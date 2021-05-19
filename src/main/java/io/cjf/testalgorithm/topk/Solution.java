package io.cjf.testalgorithm.topk;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> integers = new Solution().GetLeastNumbers_Solution(input, 4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ks = new ArrayList<>();
        if (0 < k && k < input.length) {
            int kth = findKth(input, k);
            for (int i = 0; i < input.length; i++) {
                if (input[i] <= kth && ks.size() < k) {
                    ks.add(input[i]);
                }
            }
        } else if (k == input.length) {
            for (int i = 0; i < input.length; i++) {
                ks.add(input[i]);
            }
        }

        return ks;
    }

    public int findKth(int[] a, int K) {
        // write code here
        K = K - 1;
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int pivotIdx = partition(a, left, right);
            if (pivotIdx == K) {
                return a[K];
            }
            if (pivotIdx < K) {
                left = pivotIdx + 1;
            }
            if (pivotIdx > K) {
                right = pivotIdx - 1;
            }
        }
        return a[K];
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int leftwall = left;

        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, leftwall + 1);
                leftwall++;
            }
        }
        swap(arr, left, leftwall);

        return leftwall;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
