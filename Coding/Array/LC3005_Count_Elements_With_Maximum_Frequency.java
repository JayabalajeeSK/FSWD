package Array;

import java.util.*;

public class LC3005_Count_Elements_With_Maximum_Frequency 
{
    public static int maxFrequencyElements(int[] nums) 
    {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int count = 0;

        // Count frequency and track max frequency
        for (int num : nums) 
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

        // Sum frequencies of elements having max frequency
        for (int val : freq.values()) 
        {
            if (val == maxFreq) 
            {
                count = count + val;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) 
    {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums1)); // Output: 4

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums2)); // Output: 5
    }
}
