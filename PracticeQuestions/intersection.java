package PracticeQuestions;

import java.util.HashSet;
import java.util.HashMap;

public class intersection {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> hs = new HashSet<>();
            HashMap<Integer,Integer> hm = new HashMap<>();

            // Add elements of nums1 to HashMap
            for(int num : nums1) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }

            // Check common elements and add them to HashSet
            for(int num : nums2) {
                if(hm.containsKey(num) && hm.get(num) > 0) {
                    hs.add(num);
                    hm.put(num, hm.get(num) - 1); // Decrement count
                }
            }

            // Convert HashSet to array
            int[] ans = new int[hs.size()];
            int index = 0;
            for(int num : hs) {
                ans[index++] = num;
            }

            return ans;
        }
    }

