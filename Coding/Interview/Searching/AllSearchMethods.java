package Searching;

import java.util.*;

public class AllSearchMethods {

    // 🔹 1. Linear Search (Array)
    static int linearSearch(int arr[], int target) 
    {
        for(int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    // 🔹 2. Binary Search (Normal - Sorted Array Required)
    static int binarySearch(int arr[], int target) 
    {
        int low = 0, high = arr.length - 1;

        while(low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] < target) low = mid + 1;

            else high = mid - 1;
        }
        return -1;
    }

    // 🔹 3. Binary Search - First Occurrence
    static int firstOccurrence(int arr[], int target) 
    {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) 
            {
                result = mid;
                high = mid - 1;   // move left
            }
            else if(arr[mid] < target) low = mid + 1;

            else high = mid - 1;
        }
        return result;
    }

    // 🔹 4. Binary Search - Last Occurrence
    static int lastOccurrence(int arr[], int target) 
    {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) 
            {
                result = mid;
                low = mid + 1;   // move right
            }
            else if(arr[mid] < target) low = mid + 1;

            else high = mid - 1;
        }
        return result;
    }

    // 🔹 5. ArrayList Linear Search
    static int arrayListSearch(ArrayList<Integer> list, int target) 
    {
        for(int i = 0; i < list.size(); i++) 
        {
            if(list.get(i) == target) return i;
        }
        return -1;
    }

    // 🔹 6. Built-in Search Methods
    static void builtInSearch(int arr[], int target) 
    {

        // Arrays.binarySearch (Array must be sorted)
        int index = Arrays.binarySearch(arr, target);
        System.out.println("Built-in Binary Search Index: " + index);

        // ArrayList contains()
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) list.add(num);

        System.out.println("ArrayList contains target? " + list.contains(target));

        // indexOf()
        System.out.println("ArrayList indexOf: " + list.indexOf(target));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements (sorted for binary search):");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println("\nLinear Search Index: " + linearSearch(arr, target));

        System.out.println("Binary Search Index: " + binarySearch(arr, target));

        System.out.println("First Occurrence: " + firstOccurrence(arr, target));

        System.out.println("Last Occurrence: " + lastOccurrence(arr, target));

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) list.add(num);

        System.out.println("ArrayList Search Index: " + arrayListSearch(list, target));

        builtInSearch(arr, target);

        sc.close();;;;;;;;;;;;;;;;;;;;
    }
}
// Enter array size:
// 10   
// Enter elements (sorted for binary search):
// 1 2 4 6 6 6 6 7 8 9
// Enter target:
// 6

// Linear Search Index: 3
// Binary Search Index: 4
// First Occurrence: 3
// Last Occurrence: 6
// ArrayList Search Index: 3
// Built-in Binary Search Index: 4
// ArrayList contains target? true
// ArrayList indexOf: 3