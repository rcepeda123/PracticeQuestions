package PracticeQuestions;
import java.util.*;

//Imagine you have been given an array of integers, and a query number k. Your task is to write a function that
// finds all the triplets in the array that sum up to the query number k.
//
//        Let’s illustrate this with some examples:
//
//Example 1:
//
//Input:
//
//nums = [1, 2, 3, 4, 5]
//k = 6
//Output:
//
//count_triplets(nums, k) -> 1
//In this case, there is only one triplet that sums up to 6: (1, 2, 3).
//
//Example 2:
//
//Input:
//
//nums = [1, 1, 1, 2, 2]
//k = 3
//Output:
//
//count_triplets(nums, k) -> 3
//In this case, there are three triplets that sum up to 3: (1, 1, 1), (1, 1, 1), and (1, 1, 1).
public class count_triplets {

    public int countTriplets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;

        // Sort the array to make it easier to handle duplicates
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == k) {
                    count++;

                    // Move the pointers to handle duplicates
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        count_triplets tripletCounter = new count_triplets();

        // Test case 1: Non-empty list
        int[] nums1 = {1, 2, 3, 4, 5};
        int k1 = 6;
        System.out.println("Triplets count in nums1 summing up to " + k1 + ": " + tripletCounter.countTriplets(nums1, k1));

        // Test case 2: Another non-empty list
        int[] nums2 = {1, 1, 1, 2, 2};
        int k2 = 3;
        System.out.println("Triplets count in nums2 summing up to " + k2 + ": " + tripletCounter.countTriplets(nums2, k2));

        // Test case 3: Empty list
        int[] nums3 = {};
        int k3 = 5;
        System.out.println("Triplets count in nums3 summing up to " + k3 + ": " + tripletCounter.countTriplets(nums3, k3));
    }
}
