package Array;

import java.util.*;

public class GFG_Frequency_Counter 
{

    public static List<int[]> countFrequencies(int[] arr) 
    {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) 
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Prepare the result list
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) 
        {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // Optional: sort by element value
        result.sort((a, b) -> a[0] - b[0]);

        return result;
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {10, 20, 10, 5, 20};
        int[] arr2 = {10, 20, 20};

        List<int[]> freq1 = countFrequencies(arr1);
        List<int[]> freq2 = countFrequencies(arr2);

        System.out.println("Frequencies of arr1:");
        for (int[] pair : freq1) {
            System.out.println(Arrays.toString(pair));
        }

        System.out.println("Frequencies of arr2:");
        for (int[] pair : freq2) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
// Frequencies of arr1:
// [5, 1]
// [10, 2]
// [20, 2]
// Frequencies of arr2:
// [10, 1]
// [20, 2]