package io.cjf.testalgorithm.fibonacci;

public class SolutionCache {

    private int[] fs = new int[40];

    public SolutionCache() throws Exception {
        fs[0] = 0;
        fs[1] = 1;
        fs[2] = 1;
        fs[3] = 2;
        fs[4] = 3;
        fs[5] = 5;
        fs[6] = 8;
        fs[7] = 13;
        fs[8] = 21;
        fs[9] = 34;

        fs[10] = 55;
        fs[11] = 89;
        fs[12] = 144;
        fs[13] = 233;
        fs[14] = 377;
        fs[15] = 610;
        fs[16] = 987;
        fs[17] = 1597;
        fs[18] = 2584;
        fs[19] = 4181;

        fs[20] = 6765;
        fs[21] = 10946;
        fs[22] = 17711;
        fs[23] = 28657;
        fs[24] = 46368;
        fs[25] = 75025;
        fs[26] = 121393;
        fs[27] = 196418;
        fs[28] = 317811;
        fs[29] = 514229;

        fs[30] = 832040;
        fs[31] = 1346269;
        fs[32] = 2178309;
        fs[33] = 3524578;
        fs[34] = 5702887;
        fs[35] = 9227465;
        fs[36] = 14930352;
        fs[37] = 24157817;
        fs[38] = 39088169;
        fs[39] = 63245986;
    }

    public static void main(String[] args) throws Exception {
        SolutionCache solution = new SolutionCache();
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

    public int Fibonacci(int n) {
        return fs[n];
    }
}
