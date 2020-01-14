/*
 * Decode Ways / LC 91
 */
package com.solution.coding3;

public class solution21 {
    
    // Recursive way
    // Time complexity 2^n
    // Space complexity O(1)

    public static int numWays(String data) {
        return helper(data, data.length());
    }

    public static int helper(String data, int k) {

        if (k == 0) {
            return 1;
        }

        int s = data.length() - k;

        if (data.charAt(s) == '0') {
            return 0;
        }

        int result = helper(data, k - 1);

        if (k >= 2 && Integer.parseInt(data.substring(s, s + 2)) <= 26) {
            result += helper(data, k - 2);
        }
        return result;
    }
    
    
    // Dynamic Programming
    // Time complexity O(n)
    // Space complexity O(n+1)
    public static int numDecodings(String s) {

        if (s.length() == 0) {
            return 1;
        }

        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {

            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));

            if (first >= 1 && first <= 9) {
                dp[i] += dp[i - 1];
            }

            if (second >= 10 && second <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {

        System.out.println(numWays("10"));
        System.out.println(numDecodings("10"));
    }
}
