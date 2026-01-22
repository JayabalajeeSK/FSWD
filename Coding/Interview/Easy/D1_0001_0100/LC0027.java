package Interview.Easy.D1_0001_0100;
import java.util.LinkedList;

public class LC0027 {
    public int removeElement(int[] nums, int val) 
    {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : nums)
        {
            if(i==val) continue;
            list.add(i);
        }

        for(int i : list)
        {
            System.out.print(i+" ");
        }

        int i=0;
        for(int n:list)
        {
            nums[i]=n;
            i++;
        }
        return list.size();
        
    }

    // Main method to test
    public static void main(String[] args) {
        LC0027 sol = new LC0027();

        int[] nums1 = {3,2,2,3};
        int val1=3;
        System.out.println("Original array: ");
        for (int n : nums1) System.out.print(n + " ");
        System.out.println();

        int len1 = sol.removeElement(nums1, val1);
        System.out.println("Number of unique elements: " + len1);

        System.out.print("Updated array: ");
        for (int i = 0; i < nums1.length; i++) System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.println("----");

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2=2;
        System.out.println("Original array: ");
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();

        int len2 = sol.removeElement(nums2, val2);
        System.out.println("Number of unique elements: " + len2);

        System.out.print("Updated array: ");
        for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + " ");
        System.out.println();
    }
}

