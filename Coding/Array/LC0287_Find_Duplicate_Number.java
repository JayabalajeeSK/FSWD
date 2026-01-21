package Array;

public class LC0287_Find_Duplicate_Number 
{
    public static int findDuplicate(int[] nums) 
    {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect cycle
        while (true) 
        {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) break;
        }

        // Phase 2: Find entry point of the cycle
        int slow2 = nums[0];

        while (slow != slow2) 
        {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }

    // For local testing (not required in LeetCode)
    public static void main(String[] args) 
    {
        int[] nums1 = {1,3,4,2,2};
        System.out.println(findDuplicate(nums1)); // 2

        int[] nums2 = {3,1,3,4,2};
        System.out.println(findDuplicate(nums2)); // 3

        int[] nums3 = {3,3,3,3,3};
        System.out.println(findDuplicate(nums3)); // 3
    }
}
