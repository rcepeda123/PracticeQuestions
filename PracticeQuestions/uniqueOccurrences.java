package PracticeQuestions;
import java.util.*;
//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//
//
//        Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//        Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
public class uniqueOccurrences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            // Count occurrences of each value in the array
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }

            // Check if the count of occurrences is unique
            HashSet<Integer> hs = new HashSet<>();
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                int count = entry.getValue();
                if (!hs.add(count)) {
                    return false; // If the count is not unique, return false
                }
            }
            return true;
        }
    }
}
