package com.company;

import java.util.HashMap;
import java.util.Map;

public class findPairThree {
    public static void findPairThree(int[] A, int sum) {
        //create empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        //do for each element;
        int len = A.length;
        for (int i = 0; i < len; i++) {
            //check if pair arr[i] and sum-arr[i] exists
            if (map.containsKey(sum - A[i])) {
                System.out.println("Pair found at index " + map.get(sum - A[i]) + " and " + i);
                return;
            }
            // store index of current element in the map
            map.put(A[i], i);
        }
        System.out.println("Pair not found.");
    }
}
