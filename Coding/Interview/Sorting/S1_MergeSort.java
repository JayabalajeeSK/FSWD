package Sorting;

public class S1_MergeSort {

    static void mergeSortASC(int[] arr, int left, int right) 
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;

            mergeSortASC(arr, left, mid);
            mergeSortASC(arr, mid + 1, right);

            mergeASC(arr, left, mid, right);
        }
    }

    static void mergeASC(int[] arr, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];

        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) //change- Decnding >=
            {
                arr[k++] = L[i++];
            } 
            else 
            {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];

        while (j < n2) arr[k++] = R[j++];
    }


    //----------------------------------------

    static void mergeSortDESC(int[] arr, int left, int right) 
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;

            mergeSortDESC(arr, left, mid);
            mergeSortDESC(arr, mid + 1, right);

            mergeDESC(arr, left, mid, right);
        }
    }

    static void mergeDESC(int[] arr, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];

        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) 
        {
            if (L[i] >= R[j]) //change
            {
                arr[k++] = L[i++];
            } 
            else 
            {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];

        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) 
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSortASC(arr, 0, arr.length - 1);

        for (int num : arr) System.out.print(num + " ");

        System.out.println();

        int[] arr1 = {38, 27, 43, 3, 9, 82, 10};

        mergeSortDESC(arr1, 0, arr1.length - 1);

        for (int num : arr1) System.out.print(num + " ");
    }
}
// 3 9 10 27 38 43 82 
// 82 43 38 27 10 9 3