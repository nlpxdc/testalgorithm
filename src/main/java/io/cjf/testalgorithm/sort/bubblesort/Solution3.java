package io.cjf.testalgorithm.sort.bubblesort;

public class Solution3 {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1};
        int[] numbers2 = new int[]{1, 2, 3};
        Solution3 solution = new Solution3();

        solution.bubbleSort(numbers);
        solution.bubbleSort(numbers2);
    }

    public void bubbleSort(int[] numbers) {
        boolean beSort = false;
        for (int i = 0; i < numbers.length && !beSort; i++) {
            System.out.println(String.format("i: %s", i));
            beSort = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    beSort = false;
                    int t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
    }

}
