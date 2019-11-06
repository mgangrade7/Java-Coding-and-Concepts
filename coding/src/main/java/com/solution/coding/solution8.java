/*
 * Generate Fibonacci Series
 */
package com.solution.coding;

public class solution8 {
    
    public static void fibonacci1(int l){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < l; i++) {
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }    
    }
    
    public static void main(String[] args) {
        fibonacci1(10);
    }
    
}
