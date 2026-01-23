package Interview.Medium;
import java.util.Arrays;

public class LC0189 {

    public void clockwiseRotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k % n;

        // Clockwise (Right Rotation)
        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void anticlockwiseRotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k % n;

        // Clockwise (Right Rotation)
        

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] nums, int left, int right)
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

    // 🔹 MAIN METHOD
    public static void main(String[] args) 
    {
        LC0189 obj = new LC0189();

        int[] nums = {1, 2, 3};
        int k = 2;

        System.out.println("Before Rotation: " + Arrays.toString(nums));

        obj.clockwiseRotate(nums, k);

        System.out.println("After Rotation:  " + Arrays.toString(nums));


        int[] nums2 = {1, 2, 3};
        int k2 = 2;

        System.out.println("Before Rotation: " + Arrays.toString(nums2));

        obj.anticlockwiseRotate(nums2, k2);

        System.out.println("After Rotation:  " + Arrays.toString(nums2));
    }
}
// Before Rotation: [1, 2, 3]
// After Rotation:  [2, 3, 1]
// Before Rotation: [1, 2, 3]
// After Rotation:  [3, 1, 2]