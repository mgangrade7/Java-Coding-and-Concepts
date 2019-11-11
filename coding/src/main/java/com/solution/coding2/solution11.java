/*
 * Assign new user id
 * If userId aloready exist increment the end by appending 1,2,3 etc 
 * for Input = {"sam", "john", "sam", "brian", "sam", "john"}
 * Result = {"sam", "john", "sam1", "brian", "sam2", "john1"}
 */
package com.solution.coding2;

import java.util.ArrayList;
import java.util.List;

public class solution11 {

    public static List<String> createUserId(String[] input) {
        List<String> list = new ArrayList<>();

        for (String userId : input) {
            if (!list.contains(userId)) {
                list.add(userId);
            } else {
                int count = 1;
                while (true) {
                    String newUserId = userId.concat(Integer.toString(count));
                    if (!list.contains(newUserId)) {
                        list.add(newUserId);
                        break;
                    } else {
                        count++;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        String[] input = {"sam", "john", "sam", "brian", "sam", "john"};

        List<String> result = createUserId(input);

        for (String s : result) {
            System.out.println(s);
        }

    }
}
