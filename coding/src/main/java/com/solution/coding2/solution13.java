/*
 * Last and Second last letter of a string seperated with a space
 * input = "apple', output = "e l"
 */
package com.solution.coding2;

public class solution13 {
    
    public static String func1(String word){
        StringBuilder sb = new StringBuilder();
        
        for (int i = word.length() - 2; i < word.length(); i++) {
            sb.append(word.charAt(i));
            sb.append(" ");
        }
        
        return sb.reverse().toString().trim();
    }
    
    public static void main(String[] args) {
        String input = "apple";
        
        System.out.println(func1(input));
        
    }
    
}
