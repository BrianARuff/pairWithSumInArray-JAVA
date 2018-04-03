package com.company;

import java.util.Arrays;

public class FindPairTwo {
    public static void findPairTwo(int[] A, int sum) {
        //sort array in ascending order
        Arrays.sort(A);

        //maintain two indices pointing to the end-points of the array
        int low = 0;
        int high = A.length - 1;

        // reduce search space at each iteration of loop, search space is arr[low..high];
        while (low < high) {
            //sum found
            if (A[low] + A[high] == sum) {
                System.out.println("Pair found");
                return;
            }
            //increment low index if total is less than sum;
            //decrement high index if total is greater than sum;
            if (A[low] + A[high] < sum) {
                low++;
            } else {
                high++;
            }
        }
    }
}
