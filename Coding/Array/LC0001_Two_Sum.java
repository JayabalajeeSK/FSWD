package Array;

import java.util.*;

public class LC0001_Two_Sum 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; 
    }

    // 🔹 Main method for testing
    public static void main(String[] args) 
    {

        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9))); // [0, 1]

        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6))); // [1, 2]

        int[] nums3 = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums3, 6))); // [0, 1]
    }
}
// [0, 1]
// [1, 2]
// [0, 1]