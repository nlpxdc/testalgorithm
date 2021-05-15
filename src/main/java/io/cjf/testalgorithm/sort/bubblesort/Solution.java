package io.cjf.testalgorithm.sort.bubblesort;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1};
        Solution solution = new Solution();
        solution.bubbleSort(numbers);
    }

    public void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
    }

}
