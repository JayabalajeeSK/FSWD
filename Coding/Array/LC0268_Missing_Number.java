package Array;

public class LC0268_Missing_Number 
{
    public static int missingNumber(int[] nums) 
    {
        int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) 
        {
            res = res + (i - nums[i]);
        }
        
        return res;       
    }

    public static void main(String[] args) 
    {

        int[] nums1 = {3, 0, 1};
        System.out.println("Missing Number: " + missingNumber(nums1)); // 2

        int[] nums2 = {0, 1};
        System.out.println("Missing Number: " + missingNumber(nums2)); // 2

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number: " + missingNumber(nums3)); // 8
    }
}

