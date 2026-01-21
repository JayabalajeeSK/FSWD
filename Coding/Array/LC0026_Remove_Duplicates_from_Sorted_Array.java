package Array;


public class LC0026_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        if (n == 0) return 0;

        int slow = 0;
        nums[slow] = nums[0];

        for (int fast = 1; fast < n; fast++) 
        {
            if (nums[fast] != nums[slow]) 
            {
                nums[++slow] = nums[fast];
            }
        }

        return slow + 1; // number of unique elements
    }
    // / import java.util.Collections;
// class Solution {
//     public int removeDuplicates(int[] nums) 
//     {
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int n:nums)
//         {
//             set.add(n);

//         }
//         int i = 0;
//         for (int num : set) 
//         {
//             nums[i] = num;
//             i++;
//         }
//         return set.size();
        
//     }

// }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.print("Example 1 Output: k = " + k1 + ", nums = [");
        for (int i = 0; i < nums1.length; i++) {
            if (i < k1) System.out.print(nums1[i]);
            else System.out.print("_"); // ignored elements
            if (i != nums1.length - 1) System.out.print(",");
        }
        System.out.println("]");

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.print("Example 2 Output: k = " + k2 + ", nums = [");
        for (int i = 0; i < nums2.length; i++) {
            if (i < k2) System.out.print(nums2[i]);
            else System.out.print("_");
            if (i != nums2.length - 1) System.out.print(",");
        }
        System.out.println("]");

        // Example 3 (optional custom test)
        int[] nums3 = {-1, -1, 0, 0, 1, 1, 2};
        int k3 = removeDuplicates(nums3);
        System.out.print("Example 3 Output: k = " + k3 + ", nums = [");
        for (int i = 0; i < nums3.length; i++) {
            if (i < k3) System.out.print(nums3[i]);
            else System.out.print("_");
            if (i != nums3.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
// Example 1 Output: k = 2, nums = [1,2,_]
// Example 2 Output: k = 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Example 3 Output: k = 4, nums = [-1,0,1,2,_,_,_]