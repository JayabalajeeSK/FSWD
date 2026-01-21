package String;

import java.util.*;

public class LC0229_Majority_Element_2 {

    public List<Integer> majorityElement(int[] nums) 
    {
        HashSet<Integer> ans = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) 
        {
            map.put(n, map.getOrDefault(n, 0) + 1);

            if (map.get(n) > nums.length / 3) 
            {
                ans.add(n);
            }
        }
        return new ArrayList<>(ans);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        LC0229_Majority_Element_2 sol = new LC0229_Majority_Element_2();

        // Test case 1
        int[] nums1 = {3, 2, 3};
        System.out.println(sol.majorityElement(nums1)); // [3]

        // Test case 2
        int[] nums2 = {1};
        System.out.println(sol.majorityElement(nums2)); // [1]

        // Test case 3
        int[] nums3 = {1, 2};
        System.out.println(sol.majorityElement(nums3)); // [1, 2]
    }
}
// [3]
// [1]
// [1, 2]