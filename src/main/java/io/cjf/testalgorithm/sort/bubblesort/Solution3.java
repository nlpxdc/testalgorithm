package io.cjf.testalgorithm.sort.bubblesort;

public class Solution3 {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1};
        int[] numbers2 = new int[]{1, 2, 3};
        Solution3 solution = new Solution3();

        solution.bubbleSort(numbers);
        System.out.println("aaa");
        solution.bubbleSort(numbers2);
    }

    public void bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(String.format("n: %s", i));
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int t = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
    }

}
