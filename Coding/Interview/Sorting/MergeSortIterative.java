package Sorting;

public class MergeSortIterative 
{
    
    static void merge(int[] arr, int l, int m, int r) 
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[l + i];

        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) arr[k++] = L[i++]; // >= - decending

            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];

        while (j < n2) arr[k++] = R[j++];
    }

    static void mergeSort(int[] arr) 
    {
        int n = arr.length;
        for (int currSize = 1; currSize < n; currSize = currSize * 2) 
        {
            for (int leftStart = 0; leftStart < n - 1; leftStart = leftStart + 2 * currSize) 
            {
                int mid = Math.min(leftStart + currSize - 1, n - 1);

                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}
// 3 9 10 27 38 43 82 

//82 43 38 27 10 9 3 