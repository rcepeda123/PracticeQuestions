package PracticeQuestions;
import java.util.*;

//Problem: Given an array of integers nums and an integer target,
//return the number of pairs (i, j)
//where i < j and nums[i] + nums[j] == target.
//Example:
//
//Input: nums = [2, 4, 3, 5, 6, 1, 7, 8], target = 9
//
//Output: 3
//
//Explanation: The pairs with a sum of 9 are (2, 7), (4, 5), and (3, 6).
public class sumPairs {


    public int countOfSumPairs(int[] nums , int target){
    int ans =0;
    Map<Integer,Integer> hm = new HashMap<>();
    for(int i =0; i<nums.length; i++){
        hm.put(nums[i] ,hm.getOrDefault(nums[i], 0) +1);
    }
        // Iterate over the array again to count the pairs with sum equal to target
    for(int j=0; j<nums.length; j++){
        int num = nums[j];
        int complement = target - num;
        // If the complement exists in the hashmap, add the count of pairs
        if(hm.containsKey(complement)){
            ans+=hm.get(complement);
        }
        // If num equals complement, reduce count by 1 to exclude the same number
        if(num == complement){
            ans--;
        }
    }
        // Divide ans by 2 since each pair is counted twice (i, j) and (j, i)
    return ans/2;
    }
}
