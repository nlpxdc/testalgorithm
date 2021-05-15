package io.cjf.testalgorithm.sort.selectsort;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 5,4,8,4,7};
        new Solution().selectSort(numbers);
    }

    public void selectSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minIdx] > numbers[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int t = numbers[i];
                numbers[i] = numbers[minIdx];
                numbers[minIdx] = t;
            }
//            int t = numbers[i];
//            numbers[i] = numbers[minIdx];
//            numbers[minIdx] = t;
        }
    }

}
