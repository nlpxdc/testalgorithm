package io.cjf.testalgorithm.fibonacci;

public class Solution {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int fibonacci4 = solution.Fibonacci(-1);
//        int fibonacci = solution.Fibonacci(0);
//        int fibonacci1 = solution.Fibonacci(1);
//        int fibonacci2 = solution.Fibonacci(2);
//        int fibonacci3 = solution.Fibonacci(3);
//        int fibonacci4 = solution.Fibonacci(4);
        for (int i = 0; i < 100; i++) {
            int v = solution.Fibonacci(i);
            System.out.println(String.format("n:%s, %s", i, v));
        }
    }

    public int Fibonacci(int n) throws Exception {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n > 1) {
            return Fibonacci(n-1) + Fibonacci(n-2);
        } else {
            throw new Exception("invalid params");
        }
    }
}
