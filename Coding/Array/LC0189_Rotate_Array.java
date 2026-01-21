package Array;

import java.util.Arrays;

public class LC0189_Rotate_Array 
{

    public static void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k % n;

        // Clockwise (right rotation)
        reverse(nums, 0, n - 1); //1

        reverse(nums, 0, k - 1); //2
        reverse(nums, k, n - 1); //3

        //anti - clockwise
        // reverse(nums, 0, k - 1); //2
        // reverse(nums, k, n - 1); //3

        // reverse(nums, 0, n - 1); //1
    }

    public static void reverse(int[] nums, int left, int right) 
    {
        while (left < right) 
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // Main method for testing
    public static void main(String[] args) 
    {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1)); // [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println(Arrays.toString(nums2)); // [3, 99, -1, -100]
    }
}
// [5, 6, 7, 1, 2, 3, 4]
// [3, 99, -1, -100]