package Sorting;

import java.util.*;

public class S6_BuildInSort 
{
    public static void main(String[] args) 
    {
        Integer[] arr = {5, 3, 8, 1, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = {5, 3, 8, 1, 2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2, 7,2,7));
        Collections.sort(list); // ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // descending
        System.out.println(list);
    }
}
// [8, 5, 3, 2, 1]
// [1, 2, 3, 5, 8]
// [1, 2, 2, 3, 5, 7, 7, 8]
// [8, 7, 7, 5, 3, 2, 2, 1]