package Array;


public class LC0042_Trapping_Rain_Water 
{
    public static int trap(int[] height) 
    {
        int n = height.length;
        int lo = 0, hi = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (lo < hi) 
        {
            if (height[lo] > leftMax) leftMax = height[lo];
            if (height[hi] > rightMax) rightMax = height[hi];

            if (leftMax < rightMax) 
            {
                res = res + leftMax - height[lo];
                lo++;
            } 
            else 
            {
                res = res + rightMax - height[hi];
                hi--;
            }
        }

        return res;
    }

    public static void main(String[] args) 
    {


        // Example 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int water1 = trap(height1);
        System.out.println("Example 1 Output: " + water1); // Expected: 6

        // Example 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int water2 = trap(height2);
        System.out.println("Example 2 Output: " + water2); // Expected: 9

        // Example 3 (optional)
        int[] height3 = {1, 0, 2, 1, 0, 1, 3};
        int water3 = trap(height3);
        System.out.println("Example 3 Output: " + water3); 
    }
}
// Example 1 Output: 6
// Example 2 Output: 9
// Example 3 Output: 5