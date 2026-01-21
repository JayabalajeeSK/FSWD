package Array;


class Solution {
    public static int majorityElement(int[] nums) 
    {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) 
        {
            if (count == 0) 
            {
                candidate = nums[i];
                count = 1;
            } 
            else if (nums[i] == candidate) 
            {
                count++;
            } 
            else 
            {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Example 1 Output: " + majorityElement(nums1)); // Expected: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Example 2 Output: " + majorityElement(nums2)); // Expected: 2

        // Example 3 (optional custom test)
        int[] nums3 = {1, 1, 2, 1, 3, 1, 1};
        System.out.println("Example 3 Output: " + majorityElement(nums3)); // Expected: 1
    }
}
// Example 1 Output: 3
// Example 2 Output: 2
// Example 3 Output: 1