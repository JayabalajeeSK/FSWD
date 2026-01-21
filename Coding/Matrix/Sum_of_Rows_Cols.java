package Matrix;

class MatrixRowColSum 
{

    public static void main(String[] args) 
    {

        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Print rows and row sums
        System.out.println("Rows and their sums:");
        for (int i = 0; i < rows; i++) 
        {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(matrix[i][j] + " ");
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println(" | Sum = " + rowSum);
        }

        System.out.println();

        // Print columns and column sums
        System.out.println("Columns and their sums:");
        for (int j = 0; j < cols; j++) 
        {
            int colSum = 0;
            System.out.print("Col " + j + ": ");
            for (int i = 0; i < rows; i++) 
            {
                System.out.print(matrix[i][j] + " ");
                colSum = colSum + matrix[i][j];
            }
            System.out.println("| Sum = " + colSum);
        }
    }
}
// Rows and their sums:
// 1 2 3  | Sum = 6
// 4 5 6  | Sum = 15
// 7 8 9  | Sum = 24

// Columns and their sums:
// Col 0: 1 4 7 | Sum = 12
// Col 1: 2 5 8 | Sum = 15
// Col 2: 3 6 9 | Sum = 18