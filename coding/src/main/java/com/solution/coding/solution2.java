/*
 * Reverse a Int Array
 * input A[] = {1,2,3,4,5}
 * output A[] = {5,4,3,2,1}
 */
package com.solution.coding;

import java.util.Arrays;
import java.util.Collections;

public class solution2 {
    
    // Time Complexity O(n)
    // Space Complexity O(n)
    public static int[] reverseArray1(int[] arr){
        int[] result = new int[arr.length];        
        for (int i = arr.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }
    
    // Time Complexity O(n/2)
    // Space Complexity O(1)
    public static int[] reverseArray2(int[] arr){
        int start;
        int end = arr.length - 1;
        
        // While loop can be used as String reverse problem
        for (start = 0; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
    
    // Using ibnuilt function
    public static int[] reverseArray3(int[] arr){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
    
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        
        int[] result1 = reverseArray1(input);
        
        int[] result2 = reverseArray2(input);
        
        int[] result3 = reverseArray3(input);
        
        
        
        for (int i = 0; i < input.length; i++) {
            System.out.println(result1[i] + " " + result2[i] + " " + result3[i]);
        }
        
    }
    
}
