package PracticeQuestions;
//Write a Java function that takes an array of integers and returns the maximum product of
//any two integers in the array.

//{2, 3, 4, 5, 6};
// Expected output: 30  (5 * 6)

//{-2, 3, -4, 5, 1};
// Expected output: 20  (-2 * -4)

public class maxProduct {
    public static int maxProductOfArray(int[] nums) {
            int max = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int currentProduct = nums[i] * nums[j];
                    if (currentProduct > max) {
                        max = currentProduct;
                    }
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] array1 = {2, 3, 4, 5, 6};
            System.out.println(maxProductOfArray(array1));  // Expected output: 30 (5 * 6)

            int[] array2 = {-2, 3, -4, 5, 1};
            System.out.println(maxProductOfArray(array2));  // Expected output: 20 (-2 * -4)

            int[] array3 = {-1, -2, -3, -4};
            System.out.println(maxProductOfArray(array3));  // Expected output: 12 (-3 * -4)
        }
    }
