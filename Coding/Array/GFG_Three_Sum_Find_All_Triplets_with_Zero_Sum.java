package Array;

import java.util.*;

public class GFG_Three_Sum_Find_All_Triplets_with_Zero_Sum {

    public static List<int[]> findTriplets(int[] arr) 
    {
        List<int[]> result = new ArrayList<>();
        int n = arr.length;

        // Iterate through all triplets
        for (int i = 0; i < n - 2; i++) 
        {
            for (int j = i + 1; j < n - 1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == 0) 
                    {
                        result.add(new int[]{i, j, k});
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int[] arr2 = {1, -2, 1, 0, 5};
        int[] arr3 = {2, 3, 1, 0, 5};

        System.out.println("Triplets in arr1:");
        for (int[] triplet : findTriplets(arr1)) 
        {
            System.out.println(Arrays.toString(triplet));
        }

        System.out.println("Triplets in arr2:");
        for (int[] triplet : findTriplets(arr2)) 
        {
            System.out.println(Arrays.toString(triplet));
        }

        System.out.println("Triplets in arr3:");
        List<int[]> result3 = findTriplets(arr3);
        if (result3.isEmpty()) 
        {
            System.out.println("{}");
        } 
        else 
        {
            for (int[] triplet : result3) 
            {
                System.out.println(Arrays.toString(triplet));
            }
        }
    }
}
// Triplets in arr1:
// [0, 1, 4]
// [2, 3, 4]
// Triplets in arr2:
// [0, 1, 2]
// Triplets in arr3:
// {}