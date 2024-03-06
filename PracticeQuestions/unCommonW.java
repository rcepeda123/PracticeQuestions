package PracticeQuestions;
import java.util.*;
public class unCommonW {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        // Count word frequency in s1
        String[] wordsS1 = s1.split(" ");
        for (int i = 0; i < wordsS1.length; i++) {
            hm.put(wordsS1[i], hm.getOrDefault(wordsS1[i], 0) + 1);
        }

        // Count word frequency in s2
        String[] wordsS2 = s2.split(" ");
        for (int i = 0; i < wordsS2.length; i++) {
            hm.put(wordsS2[i], hm.getOrDefault(wordsS2[i], 0) + 1);
        }

        // Find uncommon words
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }

        return ans.toArray(new String[0]);
    }
}

