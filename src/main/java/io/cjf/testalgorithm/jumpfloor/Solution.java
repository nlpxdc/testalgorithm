package io.cjf.testalgorithm.jumpfloor;

public class Solution {

    public int jumpFloor(int target) {
        int n = target;
        if (n <= 2) {
            return n;
        }
        if (n >= 3) {
            int f2 = 1;
            int f1 = 2;
            for (int i = 0; i < n - 3; i++) {
                int t = f1;
                f1 += f2;
                f2 = t;
            }
            return f1 + f2;
        }
        return -1;
    }
}
