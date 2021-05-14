package io.cjf.testalgorithm;

public class MyApp {
    public static void main(String[] args) {
        double sqrt = Math.sqrt(5);
        double pi = Math.PI;
        String str = "aaaab";
        //92567586
        System.out.println(str.hashCode());

        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        int i = Integer.bitCount(3);
        int i1 = Integer.highestOneBit(3);
        String s = Integer.toBinaryString(3);
    }

}
