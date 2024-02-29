package PracticeQuestions;
import java.util.*;

//You are given a string s of even length. Split this string into two halves of equal lengths,
// and let a be the first half and b be the second half.
//
//Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
// Notice that s contains uppercase and lowercase letters.
//
//Return true if a and b are alike. Otherwise, return false.
//
//
//
//Example 1:
//
//Input: s = "book"
//Output: true
//Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
//        Example 2:
//
//Input: s = "textbook"
//Output: false
//Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
//Notice that the vowel o is counted twice.
public class StringHalves {
    int count = 0;
    int count1 = 0;

    public boolean halvesAreAlike(String s) {
        // Calculate the midpoint of the string
        int midpoint = s.length() / 2;

        // Get the first half of the string (substring from index 0 to midpoint)
        String a = s.substring(0, midpoint);

        // Get the second half of the string (substring from midpoint to the end)
        String b = s.substring(midpoint);
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a', 0);
        hm.put('e', 0);
        hm.put('i', 0);
        hm.put('o', 0);
        hm.put('u', 0);
        hm.put('A', 0);
        hm.put('E', 0);
        hm.put('I', 0);
        hm.put('O', 0);
        hm.put('U', 0);
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (hm.containsKey(c)) {
                count++;
            }
        }
        for (int j = 0; j < b.length(); j++) {
            char k = b.charAt(j);
            if (hm.containsKey(k)) {
                count1++;
            }
        }
        if(count == count1){
            return true;
        }
        return false;
    }

}
