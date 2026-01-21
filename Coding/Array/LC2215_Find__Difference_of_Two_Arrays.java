package Array;
import java.util.*;

public class LC2215_Find__Difference_of_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) 
        {
            set1.add(n);
        }
        for (int n : nums2) 
        {
            set2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int n : set1) 
        {
            if (!set2.contains(n)) 
            {
                list1.add(n);
            }
        }

        for (int n : set2) 
        {
            if (!set1.contains(n)) 
            {
                list2.add(n);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        return answer;
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result1 = findDifference(nums1, nums2);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};
        List<List<Integer>> result2 = findDifference(nums3, nums4);
        System.out.println("Example 2 Output: " + result2);
    }
}
// Example 1 Output: [[1, 3], [4, 6]]
// Example 2 Output: [[3], []]