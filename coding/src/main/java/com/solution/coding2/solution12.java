/*
Given a list of phrases, generate a list of Wheel of Fortune "Before and After" puzzles. 
"Before and After" puzzles are where one phrase ends with the last word of the first word of another.

Input:
writing code
code rocks
Output
writing code rocks

Input
mission statement
a quick bite to eat
a chip off the old block
chocolate bar
mission impossible
a man on a mission
block party
eat my words
bar of soap

Output
a quick bite to eat my words
a chip off the old block party
chocolate bar of soap
a man on a mission statement
a man on a mission impossible
*/

package com.solution.coding2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution12 {

    public static void main(String[] args) {

        List<String> phrases = new ArrayList<>();
        
//        Test case1
        phrases.add("mission statement");
        phrases.add("a quick bite to eat");
        phrases.add("a chip off the old block");
        phrases.add("chocolate bar");
        phrases.add("mission impossible");
        phrases.add("a man on a mission");
        phrases.add("block party");
        phrases.add("eat my words");
        phrases.add("bar of soap");

//         Test case 2
//        phrases.add("a b a");
//        phrases.add("a c");

        Map<String, String> map = new HashMap<>();
        List<String> op = new ArrayList<>();

        for (String s : phrases) {
            String[] p = s.split(" ");
            int idx = p.length - 1;
            String key = p[idx];
            if (!map.containsKey(key)) {
                map.put(key, s);
            }
        }

        for (String s : phrases) {
            String[] p = s.split(" ");
            int idx = p.length - 1;
            String key = p[0];
            if(key.equals(p[idx])) continue;
            if (map.containsKey(key)) {
                String val = map.get(key);
                String[] word = val.split(" ");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < word.length - 1; i++) {
                    sb.append(word[i]);
                    sb.append(" ");
                }
                sb.append(s);
                op.add(sb.toString());
            }
        }

        for (String s : op) {
            System.out.println(s);
        }

    }

}
