package Array;


public class LC0053_Kadane_Algorithm_Maximum_Subarray {
    public static int maxSubArray(int[] nums) 
    {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            sum = sum + nums[i];
            if (sum > maximum) 
            {
                maximum = sum;
            }
            if (sum < 0) 
            {
                sum = 0;
            }
        }

        return maximum;
    }

    public static void main(String[] args) 
    {


        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1 Output: " + maxSubArray(nums1)); // Expected: 6

        // Example 2
        int[] nums2 = {1};
        System.out.println("Example 2 Output: " + maxSubArray(nums2)); // Expected: 1

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Example 3 Output: " + maxSubArray(nums3)); // Expected: 23
    }
}
// Example 1 Output: 6
// Example 2 Output: 1
// Example 3 Output: 23