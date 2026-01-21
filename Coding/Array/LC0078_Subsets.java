package Array;

import java.util.ArrayList;
import java.util.List;

public class LC0078_Subsets 
{
    public static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();

        // empty subset
        result.add(new ArrayList<>());

        for (int num : nums) 
        {
            int size = result.size();

            for (int i = 0; i < size; i++) 
            {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) 
    {


        int[] nums1 = {1, 2, 3};
        System.out.println(subsets(nums1));

        int[] nums2 = {0};
        System.out.println(subsets(nums2));
    }
}
// [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
// [[], [0]]