package Interview.Medium;

import java.util.*;

public class LC0015 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args)
    {
        LC0015 obj = new LC0015();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("Triplets with sum 0:");
        for (List<Integer> triplet : result)
        {
            System.out.println(triplet);
        }
    }
}
// Triplets with sum 0:
// [-1, -1, 2]
// [-1, 0, 1]