/*
 * Move All Zero to End of the array while maintaing array order
 * Input A[] = {0,1,2,3,0,0,12,45,2}
 * Output B[] = {1,2,3,12,45,2,0,0,0}
 */
package com.solution.coding;

public class solution5 {

    // Time Complexity O(n)
    // Space Complexity O(n)
    public static int[] moveZero1(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            int k = arr[i];
            if (k != 0) {
                result[j] = k;
                j++;
            }
        }
        return result;
    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    // Can be improved : two for loops to one
    public static int[] moveZero2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
    
    // Time Complexity O(n)
    // Space Complexity O(1)
    public static int[] moveZero3(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap operation as need to swap with 0 so no  need to store in temp variable
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] a = {0,1,2,3,0,0,12,45,2};
        int[] a = {0, 0, 0, 1, 5, 0, 30, 20, 0, 0, 0, 0, 1, 4, 7};

        int[] b = moveZero2(a);

        for (int i : b) {
            System.out.println(i);
        }
    }
}
