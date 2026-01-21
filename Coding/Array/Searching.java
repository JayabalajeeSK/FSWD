package Array;

import java.util.ArrayList;

public class Searching {

    // ---------------- LINEAR SEARCH ----------------

    // Linear search using array
    public static int linearSearch(int[] arr, int key) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Linear search using ArrayList (contains)
    public static boolean linearSearchList(ArrayList<Integer> list, int key) 
    {
        return list.contains(key);
    }

    // ---------------- BINARY SEARCH ----------------
    // NOTE: Array must be SORTED

    // Normal Binary Search (any index)
    public static int binarySearch(int[] arr, int key) 
    {
        int low = 0, high = arr.length - 1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // First Occurrence (duplicates)
    public static int binarySearchFirst(int[] arr, int key) 
    {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
            {
                ans = mid;
                high = mid - 1; // move left
            } 
            else if (arr[mid] < key) low = mid + 1;
            else  high = mid - 1;
            
        }
        return ans;
    }

    // Last Occurrence (duplicates)
    public static int binarySearchLast(int[] arr, int key) 
    {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
            {
                ans = mid;
                low = mid + 1; // move right
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 4, 5, 6};

        // Linear Search
        System.out.println("Linear Search (array): " + linearSearch(arr, 4));

        // ArrayList Search
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Linear Search (ArrayList): " + linearSearchList(list, 20));

        // Binary Search
        System.out.println("Binary Search: " + binarySearch(arr, 4));
        System.out.println("First Occurrence: " + binarySearchFirst(arr, 4));
        System.out.println("Last Occurrence: " + binarySearchLast(arr, 4));
    }
}
// Linear Search (array): 2
// Linear Search (ArrayList): true
// Binary Search: 3
// First Occurrence: 2
// Last Occurrence: 4