package Array;

import java.util.*;

public class LC1865_Finding_Pairs_With_Certain_Sum 
{
    public static int[] num1, num2;
    public static Map<Integer, Integer> map = new HashMap<>();

    public LC1865_Finding_Pairs_With_Certain_Sum(int[] nums1, int[] nums2) 
    {
        num1 = nums1;
        num2 = nums2;

        // Frequency map for nums2
        for (int n : num2)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }

    public static void add(int index, int val) 
    {
        // Remove old value
        map.put(num2[index], map.get(num2[index]) - 1);

        // Update nums2[index]
        num2[index] = num2[index] + val;

        // Add new value
        map.put(num2[index], map.getOrDefault(num2[index], 0) + 1);
    }

    public static int count(int tot) 
    {
        int count = 0;
        for (int n : num1)
        {
            count += map.getOrDefault(tot - n, 0);
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] nums2 = {1, 4, 5, 2, 5, 4};

        new LC1865_Finding_Pairs_With_Certain_Sum(nums1, nums2);

        System.out.println(count(7)); // 8
        add(3, 2);                    // [1,4,5,4,5,4]
        System.out.println(count(8)); // 2
        System.out.println(count(4)); // 1
        add(0, 1);                    // [2,4,5,4,5,4]
        add(1, 1);                    // [2,5,5,4,5,4]
        System.out.println(count(7)); // 11
    }
}
// 8
// 2
// 1
// 11