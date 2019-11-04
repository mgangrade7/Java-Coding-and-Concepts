/*
 * Two Sum Problem
 * Given an Int Array and a Int find out any of two int sum equal to given int
 */
package com.solution.coding;

import java.util.Arrays;
import java.util.HashSet;

public class solution4 {
    
    // Time Complexity O(n^2)
    // Space Complexity O(1)
    public static boolean twoSum1(int[] arr, int k){
        if(arr.length < 2) return false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == k) return true;                
            }            
        }
        return false;
    }
    
    // Time Complexity
    // To sort array: n log(n)
    // For Binary Search: log(n)
    // For loop: n
    // total: n + n log(n) + log(n)
    // space compolexity: O(1)
    public static boolean twoSum2(int[] arr, int k){
        if(arr.length < 2) return false;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = k - arr[i];
            if(Arrays.binarySearch(arr, i, arr.length, target) > 0) return true;            
        }
        return false;
    }
    
    // Works only if elments are not duplicate
    // if elements are duplicates use hashTable insted
    // Time Complexity: O(n)
    // Space Complexity: o(n) to store data in set
    public static boolean twoSum3(int[] arr, int k){
        HashSet<Integer> h = new HashSet<>();        
        for (int i = 0; i < arr.length; i++) {
            int target = k - arr[i];            
            if(h.contains(target)) {
                return true;
            }else{
                h.add(arr[i]);
            }            
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,10,9,12,16,13,11,-4};
        int k = 1;
        
        System.out.println(twoSum1(arr, k));
        
        System.out.println(twoSum2(arr, k));
        
        System.out.println(twoSum3(arr, k));
    }
    
}
