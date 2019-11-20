/*
Given two integer array A[] and B[] of size m and n(n <= m) respectively. 
We have to check whether B[] is a subset of A[] or not. An array B is a subset 
of another array A if each element of B is present in A. (There are no repeated
elements in both the arrays)
 */
package com.solution.coding2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution14 {
    
    // Time Complexity O(n^2)
    // Space Complexity O(1)
    public static boolean isSubsat1(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
        }
        return count == b.length;
    }
    
    // Time Complexity O(n)
    // Space Complexity O(n) where n = elements in array a
    public static boolean isSubsat2(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            set.add(j);            
        }
        
        for (int i = 0; i < b.length; i++) {
            int j = b[i];
            if(!set.contains(j)) return false;            
        }
        return true;        
    }
    
//    Time Complexity = Time complexity of sorting + n. 
//    Time complexity of Binary Search = O(mlogm) + n. O(logm) = O(mlogm + nlogm)
    public static boolean isSubsat3(int[] a, int[] b) {
        
        Arrays.sort(a);
        
        for (int i = 0; i < b.length; i++) {
            int j = b[i];
            if (Arrays.binarySearch(a, j) < 0) return false;            
        }
        return true;
    }

    public static void main(String[] args) {

        int[] a = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int[] b = {1, 3, 5, 9};
        
        System.out.println(isSubsat3(a, b));
    }
}
