package Array;

public class LC1534_Count_Good_Triplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int n = arr.length, ans = 0;

        for (int i = 0; i < n - 2; i++) 
        {
            for (int j = i + 1; j < n - 1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) 
                    {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        // Example 1
        int[] arr1 = {3, 0, 1, 1, 9, 7};
        int a1 = 7, b1 = 2, c1 = 3;
        System.out.println("Example 1 Output: " + countGoodTriplets(arr1, a1, b1, c1)); // Expected: 4

        // Example 2
        int[] arr2 = {1, 1, 2, 2, 3};
        int a2 = 0, b2 = 0, c2 = 1;
        System.out.println("Example 2 Output: " + countGoodTriplets(arr2, a2, b2, c2)); // Expected: 0

        // Example 3 (optional custom test)
        int[] arr3 = {1, 2, 3, 4};
        int a3 = 2, b3 = 2, c3 = 3;
        System.out.println("Example 3 Output: " + countGoodTriplets(arr3, a3, b3, c3)); // Expected: 4
    }
}
// Example 1 Output: 4
// Example 2 Output: 0
// Example 3 Output: 4