package Array;

import java.util.*;

public class LC2215_Find_Difference_of_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements to sets (distinct)
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        // Lists to store differences
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // nums1 elements not in nums2
        for (int n : set1) 
        {
            if (!set2.contains(n)) list1.add(n);
        }

        // nums2 elements not in nums1
        for (int n : set2) 
        {
            if (!set1.contains(n)) list2.add(n);
        }

        // Combine into result
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        return answer;
    }

    public static void main(String[] args) 
    {


        // Example 1
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println("Example 1 Output: " + findDifference(nums1, nums2)); // Expected: [[1,3],[4,6]]

        // Example 2
        int[] nums3 = {1,2,3,3};
        int[] nums4 = {1,1,2,2};
        System.out.println("Example 2 Output: " + findDifference(nums3, nums4)); // Expected: [[3],[]]
    }
}
// Example 1 Output: [[1, 3], [4, 6]]
// Example 2 Output: [[3], []]