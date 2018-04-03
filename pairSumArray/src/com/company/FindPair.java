package com.company;

public class FindPair {
    public static void findPair(int[] A, int sum) {
        // consider each element last element
        int len = A.length;
        for (int i = 0; i < len - 1; i++) {
            // start from i'th element till last element
            for (int j = i + 1; j < len; j++) {
                // if desired sum is found, print it and return
                if (A[i] + A[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j);
                    return;
                }
            }
        }
    }
}
