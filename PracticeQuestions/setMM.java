package PracticeQuestions;
//You have a set of integers s, which originally contains all the numbers
//from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another
//number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]
import java.util.*;
public class setMM {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Find the duplicate number and missing number
        for (int j = 1; j <= nums.length; j++) {
            if (hm.containsKey(j)) {
                if (hm.get(j) == 2) {
                    ans[0] = j; // Duplicate number
                }
            } else {
                ans[1] = j; // Missing number
            }
        }

        return ans;
    }
}

