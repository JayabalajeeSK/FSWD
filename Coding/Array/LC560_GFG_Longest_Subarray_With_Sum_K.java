package Array;

public class LC560_GFG_Longest_Subarray_With_Sum_K 
{
    static int longestSubarray(int[] arr, int k) 
    {
        int res = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            
            // Sum of subarray from i to j
            int sum = 0;
            for (int j = i; j < arr.length; j++) 
            {
                sum = sum + arr[j];
              
                // If subarray sum is equal to k
                if (sum == k) 
                {
                  
                    // find subarray length and update result
                    int subLen = j - i + 1;
                    res = Math.max(res, subLen);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(longestSubarray(arr, k));
    }
    
}
