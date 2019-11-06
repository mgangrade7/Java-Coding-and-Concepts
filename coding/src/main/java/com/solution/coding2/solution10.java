/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution.coding2;

public class solution10 {
    
    public static int countSteps(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        
        int count = countSteps(n-1) + countSteps(n-2) + countSteps(n-3);
        return count;
    }
    
    public static int countSteps1(int n){
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 4;        
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        
        return arr[arr.length-1];
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(countSteps(7));
        
        System.out.println(countSteps1(7));
    }
    
}
