package Array;

import java.util.Arrays;

public class LC0088_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = m - 1;      // last element of nums1
        int j = n - 1;      // last element of nums2
        int k = m + n - 1;  // last index of nums1

        while (i >= 0 && j >= 0) 
        {
            if (nums1[i] > nums2[j]) 
            {
                nums1[k] = nums1[i];
                i--;
            } 
            else 
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements
        while (j >= 0) 
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println("Example 1 Output: " + Arrays.toString(nums1)); // Expected: [1,2,2,3,5,6]

        // Example 2
        int[] nums3 = {1};
        int[] nums4 = {};
        merge(nums3, 1, nums4, 0);
        System.out.println("Example 2 Output: " + Arrays.toString(nums3)); // Expected: [1]

        // Example 3
        int[] nums5 = {0};
        int[] nums6 = {1};
        merge(nums5, 0, nums6, 1);
        System.out.println("Example 3 Output: " + Arrays.toString(nums5)); // Expected: [1]
    }
}
// Example 1 Output: [1, 2, 2, 3, 5, 6]
// Example 2 Output: [1]
// Example 3 Output: [1]

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         List<Integer> list1 = new ArrayList<>();
//         for (int i = 0; i < m; i++) 
//         {
//             list1.add(nums1[i]);
//         }

//         List<Integer> list2 = new ArrayList<>();
//         for (int i = 0; i < n; i++) 
//         {
//             list2.add(nums2[i]);
//         }

//         // Merge both lists
//         list1.addAll(list2);


//         Collections.sort(list1);

//         for (int i = 0; i < m + n; i++) 
//         {
//             nums1[i] = list1.get(i);
//         }

//         // Just to visualize
//         System.out.println(list1);
//     }
// }
