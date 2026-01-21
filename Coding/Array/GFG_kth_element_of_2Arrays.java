package Array;

import java.util.*;

public class GFG_kth_element_of_2Arrays 
{
    public static int kthElement(int[] a, int[] b, int k) 
    {

        ArrayList<Integer> list = new ArrayList<>();

        // add both arrays to list
        for (int x : a) list.add(x);
        for (int x : b) list.add(x);

        // sort combined list
        Collections.sort(list);

        // kth element (1-based index)
        return list.get(k - 1);
    }

    public static void main(String[] args) 
    {

        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        int result = kthElement(a, b, k);
        System.out.println("Kth Element: " + result);
    }
}
// Kth Element: 6

//--------------------------------------------------------------


// public class GFG_kth_element_of_2Arrays 
// {
//     public static int kthElement(int[] a, int[] b, int k) {
//         int i = 0, j = 0, count = 0;

//         while (i < a.length && j < b.length) {
//             count++;

//             if (a[i] <= b[j]) 
//             {
//                 if (count == k) return a[i];

//                 i++;
//             } 
//             else 
//             {
//                 if (count == k) return b[j];

//                 j++;
//             }
//         }

//         // Remaining elements in a[]
//         while (i < a.length) 
//         {
//             count++;

//             if (count == k) return a[i];

//             i++;
//         }

//         // Remaining elements in b[]
//         while (j < b.length) 
//         {
//             count++;

//             if (count == k) return b[j];

//             j++;
//         }

//         return -1;
//     }

//     public static void main(String[] args) 
//     {

//         int[] a = {2, 3, 6, 7, 9};
//         int[] b = {1, 4, 8, 10};
//         int k = 5;

//         int result = kthElement(a, b, k);
//         System.out.println("Kth Element: " + result);
//     }
// }
// Kth Element: 6