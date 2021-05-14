package io.cjf.testalgorithm.fibonacci;

public class Solution {

    private final double s5 = 2.23606797749979;
    private final double bs5 = 0.447213595499958;
    private final double x = 1.618033988749895;
    private final double y = -0.6180339887498949;

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

    public double fibonacci(int n) {
        return bs5 * (Math.pow(x, n) - Math.pow(y, n));
    }

    public int Fibonacci(int n) {
        return (int) fibonacci(n);
    }
}
