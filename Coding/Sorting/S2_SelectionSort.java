package Sorting;

public class S2_SelectionSort {
    public static void main(String[] args) 
    {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSortAsc(arr);
        System.out.println();
        selectionSortDesc(arr);
    }

    static void selectionSortAsc(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) //change
                {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }

    static void selectionSortDesc(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] > arr[minIndex]) //change
                {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
// 11 12 22 25 64 
// 64 25 22 12 11