package Array;

import java.util.HashSet;
import java.util.Set;

public class GFG_Check_Array_Is_Subset_Of_Another_Array 
{

    public static boolean isSubset(int[] a, int[] b) 
    {
        Set<Integer> set = new HashSet<>();

        // Add all elements of a[] into the set
        for (int num : a) 
        {
            set.add(num);
        }

        // Check each element of b[] in the set
        for (int num : b) 
        {
            if (!set.contains(num)) 
            {
                return false; // Not found, so b[] is not a subset
            }
        }

        return true; // All elements found
    }

    public static void main(String[] args) 
    {
        int[] a1 = {11, 1, 13, 21, 3, 7};
        int[] b1 = {11, 3, 7, 1};

        int[] a2 = {1, 2, 3, 4, 5, 6};
        int[] b2 = {1, 2, 4};

        int[] a3 = {10, 5, 2, 23, 19};
        int[] b3 = {19, 5, 3};

        System.out.println(isSubset(a1, b1)); // true
        System.out.println(isSubset(a2, b2)); // true
        System.out.println(isSubset(a3, b3)); // false
    }
}

