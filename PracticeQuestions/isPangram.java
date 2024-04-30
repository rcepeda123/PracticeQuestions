package PracticeQuestions;
import java.util.HashMap;
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//        Example 1:
//
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = "leetcode"
//Output: false

public class isPangram {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            // Only process alphabetic characters
            if (Character.isLetter(c)) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }

        // Check if all letters of the alphabet are present
        return hm.size() == 26;
    }
}


// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int i = 0; i < sentence.length(); i++) {
//             char c = sentence.charAt(i);
//             if (c != ' ') {
//                 hm.put(c, hm.getOrDefault(c, 0) + 1);
//             }
//         }

//         // Check if all letters of the alphabet are present
//         return hm.size() == 26;
//     }
// }
