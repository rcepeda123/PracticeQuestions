package PracticeQuestions;


import java.util.HashMap;
import java.util.HashSet;

//Given two integer arrays nums1 and nums2, return an array of their
//intersection
//. Each element in the result must be unique and you may return the result in any order.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
//
public class intersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<nums1.length; i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0)+1);
        }
        for(int j =0; j<nums2.length; j++){
            int nums = nums2[j];
            if(hm.containsKey(nums) && hm.get(nums) >0){
                hs.add(nums);
                hm.put(nums, hm.get(nums)-1);
            }
        }
        int[] ans = new int[hs.size()];
        int index = 0;
        for(int num :hs){
            ans[index++] = num;
        }
        return ans;
    }
}
