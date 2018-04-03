package com.company;

import java.util.HashSet;
import java.util.Set;

public class zeroSum {
    public static Boolean sumItUp(int[] A) {
        Set<Integer> set  = new HashSet<>();

        set.add(0);

        int sum = 0;

        for (int i = 0; i < A.length; i++){
            sum += A[i];

            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
