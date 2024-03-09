package PracticeQuestions;
import java.util.HashMap;
//Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays.
//If there is no common integer amongst nums1 and nums2, return -1.
//
//Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,3], nums2 = [2,4]
//Output: 2
//Explanation: The smallest element common to both arrays is 2, so we return 2.
//Example 2:
//
//Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
//Output: 2
//Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
public class minCommonVal {
    public int getCommon(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<nums1.length; i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0; j<nums2.length; j++){
            int num = nums2[j];
            if(hm.containsKey(num) && hm.get(num) <=2){
                return num;
            }
        }
        return -1;
    }

}
