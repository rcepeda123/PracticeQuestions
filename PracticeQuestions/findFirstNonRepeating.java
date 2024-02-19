package PracticeQuestions;

import java.util.HashMap;

public class findFirstNonRepeating {
public static char findFirstNonRepeating(String str) {
    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i=0; i <str.length(); i++) {
        char ans = str.charAt(i);
        hm.put(ans, hm.getOrDefault(ans, 0) + 1);
    }
    for(int i =0; i<str.length(); i++){
        char ans = str.charAt(i);
        if(hm.get(ans) == 1){
            return ans;
        }
    }
    return '0';
}

public static void main(String[] args) {
    // Test cases
    String str1 = "aabccc";
    System.out.println("Output for \"" + str1 + "\": " + findFirstNonRepeating(str1));

    String str2 = "aaaaabbbbbbdddjjjoppp";
    System.out.println("Output for \"" + str2 + "\": " + findFirstNonRepeating(str2));

    String str3 = "cab";
    System.out.println("Output for \"" + str3 + "\": " + findFirstNonRepeating(str3));
}
    }