package PracticeQuestions;
import java.util.*;
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
