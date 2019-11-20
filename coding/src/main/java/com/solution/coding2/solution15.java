/*
 * Merge two sorted Array
 */
package com.solution.coding2;

public class solution15 {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                k++;
                i++;
            } else if (a[i] > b[j]) {
                result[k] = b[j];
                k++;
                j++;
            } else if (a[i] == b[j]) {
                result[k] = a[i];
                k++;
                i++;
                result[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < a.length) {
            result[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            result[k] = b[j];
            k++;
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 3, 50};
        int[] b = {2, 3, 3, 3, 4, 5, 6, 10};

        int[] res = merge(a, b);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }

}
