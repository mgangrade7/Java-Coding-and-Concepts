/*
 * Find Maximum and Minimum in a array 
 */
package com.solution.coding2;

public class solution16 {

    // Time complexity: O(n)
    // Space complexity: O(1)
//     Total no. of comparisons (in worst case) = 2*(n-1) = 2n - 2
    public static void maxMin(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            int j = a[i];
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Max : " + max + " Min : " + min);
    }

//    Time Complexity is O(n) and Space Complexity is O(1).
//    Total number of comparisons:-
//    If n is odd, 3 * (n-1) / 2
//    If n is even, 1 + 3*(n-2)/2 = 3n/2-2
    public static void maxMin1(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (a.length % 2 == 0) {
            if (a[0] > a[1]) {
                max = a[0];
                min = a[1];
            } else {
                max = a[1];
                min = a[0];
            }
        } else {
            max = a[0];
            min = a[0];
        }
        int j = a.length % 2 == 0 ? 2 : 1;
        for (int i = j; i < a.length - 1; i = i + 2) {
            int local_max = 0;
            int local_min = 0;
            if (a[i] > a[i + 1]) {
                local_max = a[i];
                local_min = a[i + 1];
            } else {
                local_max = a[i + 1];
                local_min = a[i];
            }
            if (local_max > max) {
                max = local_max;
            }
            if (local_min < min) {
                min = local_min;
            }

        }
        System.out.println("Max : " + max + " Min : " + min);

    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 8};
        maxMin(arr);
        maxMin1(arr);
    }
}
