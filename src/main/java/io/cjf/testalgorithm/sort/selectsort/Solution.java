package io.cjf.testalgorithm.sort.selectsort;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 5,4,8,4,7};
        new Solution().selectSort(numbers);
    }

    public void selectSort(int[] numbers) {
        int minIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIdx] > numbers[j]) {
                    minIdx = j;
                }
            }
            int t = numbers[i];
            numbers[i] = numbers[minIdx];
            numbers[minIdx] = t;
        }
    }

}
