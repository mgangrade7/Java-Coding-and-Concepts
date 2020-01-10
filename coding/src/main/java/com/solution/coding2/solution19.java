/*
 * Find Second Largest Element in a Array
 */
package com.solution.coding2;

import java.util.Arrays;

public class solution19 {
    
    // Time complexity n*Logn (Log(n) for sorting)
    // Space complexity O(1)
    public static int secondGratest1(int[] arr) {

        Arrays.sort(arr);
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }
    
    // Time complexity O(n) and Two Pass
    // Space complexity O(1)
    public static int secondGratest2(int[] arr) {

        int first = arr[0];
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                first = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second == Integer.MAX_VALUE ? -1 : second;
    }
    
    // Time complexity O(n) and One Pass
    // Space complexity O(1)
    public static int secondGratest3(int[] arr) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second == Integer.MAX_VALUE ? -1 : second;
    }

    public static void main(String[] args) {

        int[] arr = {2,9,7,4,6,10};

        System.out.println(secondGratest1(arr));
        System.out.println(secondGratest2(arr));
        System.out.println(secondGratest3(arr));

    }
}
