/*
    * Given an unsorted array of integers, find the length of the longest consecutive sequence.
 */
package com.solution.coding2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution17 {

    public static int longConSeq(int[] a) {
        Arrays.sort(a);
        Set<Integer> set = new HashSet<>();
        
        
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            int prev = a[i - 1];
            int curr = a[i] - 1;
            if (prev == curr) {
                set.add(a[i]);
            } else {
                int setSize = set.size();
                if (setSize > max) {
                    max = setSize;
                }
                set.clear();
            }

        }

        return (set.size() > max ? set.size() + 1 : max + 1);
    }

    public static void main(String[] args) {

        int[] a = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};

        System.out.println(longConSeq(a));

    }

}
