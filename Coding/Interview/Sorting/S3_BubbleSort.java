package Sorting;

public class S3_BubbleSort 
{
    static void bubbleSortAsc(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) //change - < Desending
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print sorted array
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }

    static void bubbleSortDesc(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - 1 - i; j++) 
            {
                if (arr[j] < arr[j + 1]) //change
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print sorted array
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {5, 1, 4, 2, 8, 5, 3, 9, 1, 8, 0};

        bubbleSortAsc(arr);
        System.out.println();
        bubbleSortDesc(arr);


    }
}
// 0 1 1 2 3 4 5 5 8 8 9 
// 9 8 8 5 5 4 3 2 1 1 0