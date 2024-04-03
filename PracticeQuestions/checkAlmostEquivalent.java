package PracticeQuestions;

import java.util.HashMap;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        // Count frequencies in word1
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

        // Count frequencies in word2
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }

        // Check differences between frequencies
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int freq1 = hm1.getOrDefault(ch, 0);
            int freq2 = hm2.getOrDefault(ch, 0);
            int diff = Math.abs(freq1 - freq2);
            if (diff > 3) {
                return false;
            }
        }

        return true;
    }
}
