package io.cjf.testalgorithm.sort.mergesort;

public class Solution {

    public static void main(String[] args) {
//        int[] left = {1, 3, 5, 7};
//        int[] right = {2, 4, 6, 8};

        int[] numbers = new int[]{2, 3, 1, 5,4,8,4,7};
//        int[] numbers = new int[]{2, 3};

        Solution solution = new Solution();
//        int[] merge = solution.merge(left, right);

        int[] sort = solution.mergeSort(numbers);

    }

    public int[] mergeSort(int[] numbers) {
        if (numbers.length < 2) {
            return numbers;
        }
        int m = numbers.length / 2;
        int[] left = new int[m];
        int[] right = new int[numbers.length - m];
        for (int i = 0; i < numbers.length; i++) {
            if (i < m) {
                left[i] = numbers[i];
            } else {
                right[i - m] = numbers[i];
            }
        }
        int[] merge = merge(mergeSort(left), mergeSort(right));
        return merge;
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
                c++;
            } else if (left[i] > right[j]){
                result[c] = right[j];
                j++;
                c++;
            } else {
                result[c] = left[i];
                i++;
                c++;
                result[c] = right[j];
                j++;
                c++;
            }
        }

        while (i < left.length)  {
            result[c] = left[i];
            i++;
            c++;
        }

        while (j < right.length) {
            result[c] = right[j];
            j++;
            c++;
        }

        return result;
    }

}
