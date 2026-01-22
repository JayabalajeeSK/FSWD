package Interview.Easy.D1_0001_0100;
import java.util.Arrays;

public class LC0001 
{
    public int[] twoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // no pair found
    }

    public static void main(String[] args) 
    {
        LC0001 sol = new LC0001();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result.length > 0)
        {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]]);
        }
        else
        {
            System.out.println("No pair found");
        }
    }
}
