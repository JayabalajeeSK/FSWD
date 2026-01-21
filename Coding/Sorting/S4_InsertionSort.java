package Sorting;

public class S4_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 6};
        insertionSortAsc(arr);
        System.err.println();
        insertionSortDesc(arr);


    }

    static void insertionSortAsc(int arr[])
    {
            for (int i = 1; i < arr.length; i++) 
            {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) //change
                {
                    arr[j + 1] = arr[j]; // shift
                    j--;
                }

                arr[j + 1] = key; // insert
            }

            // print sorted array
            for (int num : arr) 
            {
                System.out.print(num + " ");
            }
    }

    static void insertionSortDesc(int arr[])
    {
            for (int i = 1; i < arr.length; i++) 
            {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) //change
                {
                    arr[j + 1] = arr[j]; // shift
                    j--;
                }

                arr[j + 1] = key; // insert
            }

            // print sorted array
            for (int num : arr) 
            {
                System.out.print(num + " ");
            }
    }
}
