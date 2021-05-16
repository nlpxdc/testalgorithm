package io.cjf.testalgorithm.twosum;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] numbers = new int[]{3,2,4};
//        int target = 6;

        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    //O(n2)
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
//                System.out.println(String.format("%s + %s = %s", numbers[i], numbers[j], sum));
                if (sum == target) {
                    System.out.println(String.format("%s + %s = %s", numbers[i], numbers[j], sum));
                    System.out.println(String.format("%s + %s", i, j));
                    int[] result = new int[2];
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    //todo O(nlgn), 排序，二分查找
    //todo O(n), 排序预处理，双指针
}
