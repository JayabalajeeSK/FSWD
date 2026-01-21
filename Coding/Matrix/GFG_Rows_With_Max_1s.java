package Matrix;

public class GFG_Rows_With_Max_1s
{
    static int rowWithMax1s(int arr[][]) 
    {
        int n = arr.length;
        int m = arr[0].length;

        int rowIndex = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) 
        {
            while (j >= 0 && arr[i][j] == 1) 
            {
                j--;
                rowIndex = i;
            }
        }

        return rowIndex;
    }

    // Main method
    public static void main(String[] args) 
    {

        int[][] arr = 
        {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(arr);
        System.out.println("Row with maximum 1s: " + result);
    }
}
// Row with maximum 1s: 2