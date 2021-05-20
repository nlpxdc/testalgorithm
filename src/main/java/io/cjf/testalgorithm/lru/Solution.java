package io.cjf.testalgorithm.lru;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};

        Solution solution = new Solution();
        int[] lru = solution.LRU(input, 3);

    }
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        LinkedList<Integer> results = new LinkedList<>();
        LRULinkedHashMap<Integer, Integer> lru = new LRULinkedHashMap<>(k);
        for (int[] operator : operators) {
            int op = operator[0];
            if (op == 1) {
                lru.put(operator[1], operator[2]);
            }

            if (op == 2) {
                Integer number = lru.get(operator[1]);
                if (number == null) {
                    number = -1;
                }
                results.add(number);
            }
        }
        return results.stream().mapToInt(value -> value).toArray();
    }

    public static class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {

        private int threshold;

        public LRULinkedHashMap(int threshold) {
            super(16, 0.75f, true);
            this.threshold = threshold;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > threshold;
        }
    }

}
