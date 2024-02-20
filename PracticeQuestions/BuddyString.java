package PracticeQuestions;
import java.util.*;
//Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal,
// otherwise, return false.
//
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j
// and swapping the characters at s[i] and s[j].
//
//        For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
//
//
//Example 1:
//
//Input: s = "ab", goal = "ba"
//Output: true
//Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
//        Example 2:
//
//Input: s = "ab", goal = "ab"
//Output: false
//Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
//        Example 3:
//
//Input: s = "aa", goal = "aa"
//Output: true
//Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
public class BuddyString {

    class Solution {
        public boolean buddyStrings(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }

            if (s.equals(goal)) {
                // If both strings are identical, check if there are any repeated characters
                Set<Character> set = new HashSet<>();
                for (char c : s.toCharArray()) {
                    if (!set.add(c)) {
                        return true; // Found repeated character, can swap
                    }
                }
                return false; // No repeated characters, can't swap
            } else {
                // Find the indices where the characters are different
                List<Integer> diffs = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != goal.charAt(i)) {
                        diffs.add(i);
                    }
                }

                // If there are exactly 2 differences, check if swapping characters at those indices makes the strings equal
                return diffs.size() == 2 && s.charAt(diffs.get(0)) == goal.charAt(diffs.get(1)) && s.charAt(diffs.get(1)) == goal.charAt(diffs.get(0));
            }
        }
    }

}
