/*
 * Print next big integer in a int array for each element
 * If not found print NA
 * 
 */
package com.solution.coding;

public class solution6 {
    // Time Complexity O(n^2)
    // Space Complexity O(1)
    public static void printGreater(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                } else if (j == arr.length - 1) {
                    System.out.println(arr[i] + " NA");
                }
            }
        }
        System.out.println(arr[arr.length - 1] + " NA");
    }

    public static void main(String[] args) {

        int[] a = {5, 6, 9, 8, 10, 11, 2, 12, 13, 5, 1, 17};
        
        printGreater(a);

    }
}
