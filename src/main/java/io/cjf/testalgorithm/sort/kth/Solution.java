package io.cjf.testalgorithm.sort.kth;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 5,4,8,4,7};

        int kth = new Solution().findKth(numbers, 0, 1);
    }


    public int findKth(int[] a, int n, int K) {
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
            if (arr[i] > pivot) {
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
