package io.cjf.testalgorithm.sort.insertsort;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 5,4,8,4,7};
        new Solution().insertSort(numbers);
    }

    public void insertSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j-1] > numbers[j]) {
                    int t = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
    }

}
