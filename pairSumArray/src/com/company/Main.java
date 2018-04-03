package com.company;

import static com.company.FindPair.findPair;
import static com.company.FindPairTwo.findPairTwo;
import static com.company.findPairThree.findPairThree;

public class Main {

    public static void main(String[] args) {

        int A[] = {8, 7, 2, 5, 3, 1};
        int sum = 10;

//        findPair(A, sum);
//        findPairTwo(A, sum)
//        findPairThree(A, sum);
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            findPairThree(A, sum);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }

    /* results

        findPair(): 6048539276 ns

        findPairTwo(): 5277386525 ns

        findPairThree(): 4845864175 ns
     */
}
