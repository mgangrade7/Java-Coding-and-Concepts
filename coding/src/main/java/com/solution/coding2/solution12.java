/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution.coding2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class solution12 {
    public static void main(String[] args) {
        
        List<String> phrases = new ArrayList<>();
        
        phrases.add("reading paper");
        phrases.add("paper rocks");
        phrases.add("a am mayank");
        phrases.add("i am gangrade1");
        phrases.add("mayank gangrade");
        
        Map<String, String> map = new HashMap<>();
        List<String> op = new ArrayList<>();
        
        for(String s : phrases){
            String[] p = s.split(" ");
            int idx = p.length - 1;
            String key = p[idx];             
            if(!map.containsKey(key)){
                map.put(key, s);
            }
        }
        
        for(String s : phrases){
            String[] p = s.split(" ");
            String key = p[0];
            if(map.containsKey(key)){
                String val = map.get(key);
                String[] word = val.split(" ");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < word.length -1 ; i++) {
                    sb.append(word[i]);
                    sb.append(" ");
                }
//                sb.append(" ");
                sb.append(s);
                op.add(sb.toString());
            }
        }
        
       
        
        
        
        
    }
 
}
