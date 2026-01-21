package Array;


public class LC2815_Max_Pair_Sum_in_Array 
{
    public static int maxSum(int[] nums) 
    {
        int ans = -1;

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                int num1 = nums[i];
                int num2 = nums[j];

                int maxDigitInNum1 = 0;
                int maxDigitInNum2 = 0;

                // Find max digit in nums[i]
                while (num1 > 0)
                {
                    int digit = num1 % 10;
                    num1 = num1 / 10;
                    maxDigitInNum1 = Math.max(maxDigitInNum1, digit);
                }

                // Find max digit in nums[j]
                while (num2 > 0)
                {
                    int digit = num2 % 10;
                    num2 = num2 / 10;
                    maxDigitInNum2 = Math.max(maxDigitInNum2, digit);
                }

                if (maxDigitInNum1 == maxDigitInNum2)
                {
                    ans = Math.max(ans, nums[i] + nums[j]);
                }
            }
        }
        return ans;
    }

    // 🔹 Main method for testing
    public static void main(String[] args) 
    {

        int[] nums1 = {112, 131, 411};
        System.out.println(maxSum(nums1)); // -1

        int[] nums2 = {2536, 1613, 3366, 162};
        System.out.println(maxSum(nums2)); // 5902

        int[] nums3 = {51, 71, 17, 24, 42};
        System.out.println(maxSum(nums3)); // 88
    }
}

