package com.company;

import static com.company.zeroSum.sumItUp;

public class Main {

    public static void main(String[] args) {
        int[] A = {4, -6, 3, -1, 4, 2, 7};
        if (sumItUp(A)) {
            System.out.println("Subarray exist.");
        } else {
            System.out.println("Subarray doesn't exist");
        }
    }
}
