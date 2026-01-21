package Matrix;

public class RotateMatrix 
{

    public static void rotate(int[][] matrix) 
    {
        int N = matrix.length;

        for (int x = 0; x < N / 2; x++) 
        {
            for (int y = x; y < N - 1 - x; y++) 
            {

                int temp = matrix[x][y];

                matrix[x][y] = matrix[N - 1 - y][x];
                matrix[N - 1 - y][x] = matrix[N - 1 - x][N - 1 - y];
                matrix[N - 1 - x][N - 1 - y] = matrix[y][N - 1 - x];
                matrix[y][N - 1 - x] = temp;
            }
        }
    }

    // Main method
    public static void main(String[] args) 
    {

        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nMatrix after 90° Clockwise Rotation:");
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
// 1 2 3 
// 4 5 6 
// 7 8 9 

// Matrix after 90° Clockwise Rotation:
// 7 4 1
// 8 5 2
// 9 6 3