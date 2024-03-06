package PracticeQuestions;
import java.util.*;

//In an alien language, surprisingly, they also use English lowercase letters, but possibly
//in a different order. The order of the alphabet is some permutation of lowercase letters.
//
//Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given
//words are sorted lexicographically in this alien language.
//
//Example 1:
//
//Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//Output: true
//Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
//        Example 2:
//
//Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//Output: false
//Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
//        Example 3:
//
//Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//Output: false
//Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical
//    rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
public class alienSort {
    public boolean isAlienSorted(String[] words, String order) {
        // Create a map to store the order of characters in the alien language
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        // Check if the words array is sorted lexicographically
        for (int i = 0; i < words.length - 1; i++) {
            if (!isLexicographicallySorted(words[i], words[i + 1], map)) {
                return false;
            }
        }

        return true;
    }

    // Helper method to check if word1 comes before word2 lexicographically
    private boolean isLexicographicallySorted(String word1, String word2, Map<Character, Integer> map) {
        int n = word1.length();
        int m = word2.length();

        // Compare each character of word1 and word2 based on the order in the map
        for (int i = 0; i < Math.min(n, m); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            // If the characters are in different positions in the map, return based on their order
            if (map.get(c1) < map.get(c2)) {
                return true;
            } else if (map.get(c1) > map.get(c2)) {
                return false;
            }
        }

        // If all characters match and word1 is shorter or equal to word2, return true
        return n <= m;
    }
}
