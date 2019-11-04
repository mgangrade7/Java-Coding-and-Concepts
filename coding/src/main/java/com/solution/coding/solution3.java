/*
 * Check for string Palindrome
 * Palindrome: a word, phrase, or sequence that reads the same backward as forward
 * Input: Str1 = heloleh
 * Output: True
 */
package com.solution.coding;

public class solution3 {
    
    // Time Complexity O(n/2)
    // Space Complexity O(1)
    public static boolean isPalindrome1(String str){
        int start = 0;
        int end = str.length() - 1;        
        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
    // Using provided methods
    public static boolean isPalindrome2(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return (str.equals(sb.toString()));
    }
    
    // To demonstrate array
    public static boolean isPalindrome3(String str){
        char[] charArray = str.toCharArray();
        
        for (int i = 0, j = charArray.length - 1; i < charArray.length/2; i++, j--) {
            if(charArray[i] != charArray[j]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        String input = "heloleh";
        
        System.out.println(isPalindrome1(input));
        
        System.out.println(isPalindrome2(input));
        
        System.out.println(isPalindrome3(input));
    }
    
}
