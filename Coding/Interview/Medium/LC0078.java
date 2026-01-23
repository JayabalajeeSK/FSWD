package Interview.Medium;

import java.util.ArrayList;
import java.util.List;

public class LC0078 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();

        // start with empty subset
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

    // 🔹 MAIN METHOD
    public static void main(String[] args)
    {
        LC0078 obj = new LC0078();

        int[] nums = {1, 2, 3};

        List<List<Integer>> subsets = obj.subsets(nums);

        System.out.println("Subsets are:");
        for (List<Integer> subset : subsets)
        {
            System.out.println(subset);
        }
    }
}
// Subsets are:
// []
// [1]
// [2]
// [1, 2]
// [3]
// [1, 3]
// [2, 3]
// [1, 2, 3]