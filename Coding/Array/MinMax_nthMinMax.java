package Array;

import java.util.Arrays;

public class MinMax_nthMinMax {

    // Maximum element in array
    public static int max(int[] arr) 
    {
        int max = arr[0];
        for (int num : arr) 
        {
            if (num > max) max = num;
        }
        return max;
    }

    // Minimum element in array
    public static int min(int[] arr) 
    {
        int min = arr[0];
        for (int num : arr) 
        {
            if (num < min) min = num;
        }
        return min;
    }

    // Nth maximum element in array
    public static int nthMax(int[] arr, int n) 
    {
        Arrays.sort(arr); // Sort ascending
        if (n <= 0 || n > arr.length) return -1; // Invalid n
        return arr[arr.length - n];
    }

    // Nth minimum element in array
    public static int nthMin(int[] arr, int n) 
    {
        Arrays.sort(arr); // Sort ascending
        if (n <= 0 || n > arr.length) return -1; // Invalid n
        return arr[n - 1];
    }

    // Example usage
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 9, 1, 7};

        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));
        System.out.println("2nd Max: " + nthMax(arr, 2));
        System.out.println("3rd Min: " + nthMin(arr, 3));
    }
}
// Max: 9
// Min: 1
// 2nd Max: 7
// 3rd Min: 5