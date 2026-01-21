package Array;

import java.util.*;

public class LC0349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) 
    {
        // Use sets to store unique elements
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) set2.add(num);

        // Keep only elements present in both sets
        set1.retainAll(set2);

        // Convert set to array
        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) 
        {
            result[i] = num;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println("Example 1 Output: " + Arrays.toString(intersection(nums1, nums2))); // Expected: [2]

        // Example 2
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        System.out.println("Example 2 Output: " + Arrays.toString(intersection(nums3, nums4))); // Expected: [4, 9] (order may vary)
    }
}
// Example 1 Output: [2]
// Example 2 Output: [4, 9]