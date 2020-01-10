/*
 * Largest Sum Contiguous Subarray / Maximum Sum SubArray / Kadane's Algorithm
 */
package com.solution.coding3;

public class solution20 {
    // Brute Force
    // Time complexity n^2
    // Space complexity O(1)
    static int maxSubarray(int[] nums) {

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
    
    // Dynamic Programming (Kadane's Algorithm)
    // Time complexity O(n)
    // Space complexity O(1)
    static int maxSubarray2(int[] nums) {

        int maxSum = nums[0];
        int tempSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            tempSum = Math.max(nums[i], tempSum + nums[i]);
            if (maxSum < tempSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubarray(arr));
        System.out.println(maxSubarray2(arr));
    }

}
