/*
 * Reverse A String
 * Input = apple
 * Outpur = elppa
 */
package com.solution.coding;

public class solution1 {
    
    // Using Inbuilt method of String builder
    public static String reverseString1(String str){
        StringBuilder sb = new StringBuilder();        
        sb.append(str);        
        sb.reverse();        
        return sb.toString();
    }
    
    // Time complexity O(n)
    // Space complexity
    public static String reverseString2(String str){
        if(str.length() == 1) return str;
        String result = "";        
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }        
        return result;
    }
    
    // using swapping method
    public static String reverseString3(String str){
        if(str.length() == 1) return str;
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;            
        }
        return (new String(charArray));
       
    }
    
    public static void main(String[] args) {
        
        String input = "apple";        
        
        System.out.println(reverseString1(input));
        System.out.println(reverseString2(input));
        System.out.println(reverseString3(input));
    }
    
}
