package io.cjf.testalgorithm.fibonacci;

public class SolutionIterate {

    private int[] fs = new int[40];

    public SolutionIterate() throws Exception {
        for (int i = 0; i < 40; i++) {
            fs[i] = fibonacci(i);
        }
    }

    public static void main(String[] args) throws Exception {
        SolutionIterate solution = new SolutionIterate();
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

    public int fibonacci(int n) throws Exception {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n > 1) {
            int f1 = 1;
            int f2 = 0;
            //todo calc f1f2
            for (int i = 0; i < n - 2; i++) {
                int origF1 = f1;
                f1 += f2;
                f2 = origF1;
            }
            return f1 + f2;
        } else {
            throw new Exception("invalid params");
        }
    }

    public int Fibonacci(int n) {
        return fs[n];
    }
}
