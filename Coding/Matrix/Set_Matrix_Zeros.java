package Matrix;

public class Set_Matrix_Zeros 
{

    public void setZeroes(int[][] matrix) 
    {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] arr = new int[row][column];

        // Copy matrix to arr
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < column; j++) 
            {
                arr[i][j] = matrix[i][j];
            }
        }

        // Set zeroes
        for (int a = 0; a < row; a++) 
        {
            for (int b = 0; b < column; b++) 
            {
                if (arr[a][b] == 0) 
                {

                    // Zero entire row
                    for (int i = 0; i < column; i++) 
                    {
                        matrix[a][i] = 0;
                    }

                    // Zero entire column
                    for (int i = 0; i < row; i++) 
                    {
                        matrix[i][b] = 0;
                    }
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) 
    {

        Set_Matrix_Zeros obj = new Set_Matrix_Zeros();

        int[][] matrix = 
        {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.setZeroes(matrix);

        System.out.println("\nMatrix after setZeroes:");
        printMatrix(matrix);
    }

    // Helper method to print matrix
    static void printMatrix(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Original Matrix:
// 1 1 1 
// 1 0 1 
// 1 1 1 

// Matrix after setZeroes:
// 1 0 1
// 0 0 0
// 1 0 1