/*
 * Factorila of a number
 */
package com.solution.coding;

public class solution9 {

    // iterative
    public static int factorial1(int k) {
        if (k == 0) {
            return 1;
        }
        int num = 1;
        for (int i = k; i > 0; i--) {
            num = num * i;
        }
        return num;
    }

    //recursive
    public static int factorial2(int k) {

        return ((k == 0 || k == 1) ? 1 : k * factorial2(k - 1));

    }

    public static void main(String[] args) {

        System.out.println(factorial1(5));
        System.out.println(factorial2(5));
    }
}
