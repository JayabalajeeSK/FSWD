package Interview.Easy.D1_0001_0100;
import java.util.LinkedHashSet;
import java.util.Set;

public class LC0026 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : nums) set.add(n);

        int i = 0;
        int arr[] = new int[set.size()];
        for (int n : set) 
        {
            arr[i] = n;
            i++;
        }

        // Print unique elements
        System.out.print("Unique elements: ");
        for (int n : arr) 
        {
            System.out.print(n + " ");
        }
        System.out.println();

        // Update original array nums (optional, as per your code)
        i = 0;
        for (int n : set) {
            nums[i] = n;
            i++;
        }

        return set.size();
    }

    // Main method to test
    public static void main(String[] args) {
        LC0026 sol = new LC0026();

        int[] nums1 = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("Original array: ");
        for (int n : nums1) System.out.print(n + " ");
        System.out.println();

        int len1 = sol.removeDuplicates(nums1);
        System.out.println("Number of unique elements: " + len1);

        System.out.print("Updated array: ");
        for (int i = 0; i < nums1.length; i++) System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.println("----");

        int[] nums2 = {0, 0, 1, 1, 2};
        System.out.println("Original array: ");
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();

        int len2 = sol.removeDuplicates(nums2);
        System.out.println("Number of unique elements: " + len2);

        System.out.print("Updated array: ");
        for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + " ");
        System.out.println();
    }
}
