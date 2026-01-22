package Interview.Easy.D1_0001_0100;

public class LC0035 {

    // Binary Search method
    public static int binarySearch(int[] arr, int target) 
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) 
        {
            int mid = (left + right) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left; // not found //-1
    }

    // Main method
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 2;

        int result = binarySearch(arr, target);

        //if (result != -1)
            System.out.println("Target found at index: " + result);
        //else
            //System.out.println("Target not found");
    }
}

