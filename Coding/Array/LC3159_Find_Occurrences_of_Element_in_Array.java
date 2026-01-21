package Array;

import java.util.*;

public class LC3159_Find_Occurrences_of_Element_in_Array 
{
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) 
    {
        List<Integer> freq = new ArrayList<>();

        // Store indices where nums[i] == x
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == x) 
            {
                freq.add(i);
            }
        }

        // Process queries
        for (int i = 0; i < queries.length; i++) 
        {
            if (queries[i] > freq.size()) 
            {
                queries[i] = -1;
            } 
            else 
            {
                queries[i] = freq.get(queries[i] - 1);
            }
        }

        return queries;
    }

    // Main method for testing
    public static void main(String[] args) 
    {

        int[] nums1 = {1, 3, 1, 7};
        int[] queries1 = {1, 3, 2, 4};
        int x1 = 1;
        System.out.println(Arrays.toString(occurrencesOfElement(nums1, queries1, x1)));

        int[] nums2 = {1, 2, 3};
        int[] queries2 = {10};
        int x2 = 5;
        System.out.println(Arrays.toString(occurrencesOfElement(nums2, queries2, x2)));
    }
}
// [0, -1, 2, -1]
// [-1]