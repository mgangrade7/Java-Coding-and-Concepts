/*
 * Anagram
 * Str1 = listen
 * Str2 = silent
 * Op = Yes
 */
package com.solution.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution7 {

    // Time Complexity O(n)
    // Space Complexity O(n) where n = 256
    public static boolean isAnagram1(String s1, String s2) {
        int[] arr = new int[256]; //Number of Ascii Values

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // Time Complexity O(n)
    // Space Complexity O(n)
    public static boolean isAnagram2(String s1, String s2) {
        List<Character> list = new ArrayList<>();

        for (char c : s1.toCharArray()) {
            list.add(c);
        }

        for (char c : s2.toCharArray()) {
            list.remove(new Character(c));
        }

        return (list.isEmpty());
    }

    public static boolean isAnagram3(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        for (int i = 0; i < s1Arr.length; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram1(s1, s2));
        System.out.println(isAnagram2(s1, s2));
        System.out.println(isAnagram3(s1, s2));

    }
}
