// package Array;

// import java.util.*;

package Array;

import java.util.*;

public class LC0015_Scaler_Three_Sum
{
    public static List<List<Integer>> threeSum(int[] nums, int target)
    {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // Step 1: Sort

        for (int i = 0; i < nums.length - 2; i++)
        {
            // Step 2: Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Two-pointer approach
            while (left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target)
                {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Step 4: Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }

    // 🔹 Main method
    public static void main(String[] args)
    {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums1, 0));
        // [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println(threeSum(nums2, 10));
        // [[1, 3, 6], [1, 4, 5], [2, 3, 5]]

        int[] nums3 = {0, 0, 0, 0};
        System.out.println(threeSum(nums3, 0));
        // [[0, 0, 0]]
    }
}
// [[-1, -1, 2], [-1, 0, 1]]
// [[1, 3, 6], [1, 4, 5], [2, 3, 5]]
// [[0, 0, 0]]
// public class LC0015_Scaler_Three_Sum 
// {
//     public static List<List<Integer>> threeSum(int[] nums) 
//     {
//         List<List<Integer>> result = new ArrayList<>();

//         Arrays.sort(nums);  // Step 1: Sort the array

//         for (int i = 0; i < nums.length - 2; i++) 
//         {
//             // Step 2: Skip duplicate first elements
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             int left = i + 1;
//             int right = nums.length - 1;

//             // Step 3: Two pointer approach
//             while (left < right) 
//             {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (sum == 0) //target 
//                 {
//                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));

//                     // Step 4: Skip duplicates
//                     while (left < right && nums[left] == nums[left + 1]) left++;
//                     while (left < right && nums[right] == nums[right - 1]) right--;

//                     left++;
//                     right--;
//                 } 
//                 else if (sum < 0) 
//                 {
//                     left++;
//                 } 
//                 else 
//                 {
//                     right--;
//                 }
//             }
//         }
//         return result;
//     }

//     // 🔹 Main method for testing
//     public static void main(String[] args) 
//     {

//         int[] nums1 = {-1, 0, 1, 2, -1, -4};
//         System.out.println(threeSum(nums1)); 
//         // Output: [[-1, -1, 2], [-1, 0, 1]]

//         int[] nums2 = {0, 1, 1};
//         System.out.println(threeSum(nums2)); 
//         // Output: []

//         int[] nums3 = {0, 0, 0};
//         System.out.println(threeSum(nums3)); 
//         // Output: [[0, 0, 0]]
//     }
// }
