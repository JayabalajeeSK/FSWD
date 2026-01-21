package Sorting;

public class S5_QuickSort
{

    static void quickSortAsc(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partitionAsc(arr, low, high);

            quickSortAsc(arr, low, pi - 1);
            quickSortAsc(arr, pi + 1, high);
        }
    }

    static int partitionAsc(int[] arr, int low, int high) 
    {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) //change
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSortDesc(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partitionDesc(arr, low, high);

            quickSortDesc(arr, low, pi - 1);
            quickSortDesc(arr, pi + 1, high);
        }
    }

    static int partitionDesc(int[] arr, int low, int high) 
    {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (arr[j] > pivot) //change
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSortAsc(arr, 0, arr.length - 1);

        for (int num : arr) System.out.print(num + " ");

        System.out.println();

        int[] arr1 = {10, 7, 8, 9, 1, 5};

        quickSortDesc(arr1, 0, arr1.length - 1);

        for (int num : arr1) System.out.print(num + " ");
    }
}
// 1 5 7 8 9 10 
// 10 9 8 7 5 1