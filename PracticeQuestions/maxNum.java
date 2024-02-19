
package PracticeQuestions;
import java.util.Arrays;



//Given a list of integers, write a function that returns the maximum number
//in the list. If the list is empty, return None.

//Sorting approach
//public class maxNum {
//    public int maxNumInList(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return -1; // Indicate that the list is empty (you can choose any value here)
//        }
//        Arrays.sort(nums);
//        return nums[nums.length - 1];
//    }

public class maxNum {
    public int maxNumInList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // Indicate that the list is empty (you can choose any value here)
        }
         int currGreatest = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[currGreatest] < nums[i]) {
                currGreatest = i;
            }
        }
        return nums[currGreatest];
    }

    public static void main(String[] args) {
        maxNum maxNumFinder = new maxNum();

        // Test case 1: Non-empty list
        int[] nums1 = {4, 2, 7, 1, 9};
        System.out.println("Maximum in nums1: " + maxNumFinder.maxNumInList(nums1));

        // Test case 2: Empty list
        int[] nums2 = {};
        System.out.println("Maximum in nums2: " + maxNumFinder.maxNumInList(nums2));
    }
}
