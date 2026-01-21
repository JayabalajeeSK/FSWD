package Array;

import java.util.Arrays;

public class LC0031_Next_Permutation {
    public static void nextPermutation(int[] nums) 
    {
        if (nums.length == 1) return;

        int len = nums.length;
        int i = len - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i + 1] <= nums[i]) 
        {
            i--;
        }

        if (i >= 0) 
        {
            // Step 2: Find element to swap with
            for (int j = len - 1; j >= i; j--) 
            {
                if (nums[j] > nums[i]) 
                {
                    swap(nums, i, j);
                    reverse(nums, i + 1);
                    return;
                }
            }
        }

        // If no larger permutation possible, reverse whole array
        reverse(nums, 0);
    }

    private static void reverse(int[] nums, int start) 
    {
        int i = start, j = nums.length - 1;
        while (i < j) 
        {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int idx1, int idx2) 
    {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println("Example 1 Output: " + Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Example 2 Output: " + Arrays.toString(nums2));

        // Example 3
        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Example 3 Output: " + Arrays.toString(nums3));
    }
}
// Example 1 Output: [1, 3, 2]
// Example 2 Output: [1, 2, 3]
// Example 3 Output: [1, 5, 1]