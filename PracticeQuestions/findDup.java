package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//find the list of duplicates words in a String
public class findDup {

    public List<String> findDupWord(String[] words){
        List<String> ans = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        for(int i =0; i<words.length; i++){
            hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
        }
        for(int j =0; j<words.length; j++){
            String c = words[j];
            if(hm.get(c) >1){
                ans.add(c);
            }

        }
        return ans;

    }

public static void main(String[] args) {
    findDup finder = new findDup();
    String[] words = {"apple", "banana", "apple", "orange", "banana", "grape"};
    List<String> duplicates = finder.findDupWord(words);
    System.out.println("Duplicate words: " + duplicates);
}
}

//public class FindDuplicates {
//
//    public List<String> findDupWord(String[] words) {
//        List<String> duplicates = new ArrayList<>();
//        Map<String, Integer> wordCount = new HashMap<>();
//
//        for (String word : words) {
//            int count = wordCount.getOrDefault(word, 0);
//            wordCount.put(word, count + 1);
//            if (count == 1) {
//                duplicates.add(word);
//            }
//        }
//
//        return duplicates;
//    }
