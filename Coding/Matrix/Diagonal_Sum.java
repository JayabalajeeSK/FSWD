package Matrix;

public class Diagonal_Sum {

    public static void main(String[] args) 
    {

        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        int primarySum = 0;
        int secondarySum = 0;

        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(matrix[i][i] + " ");
            primarySum = primarySum + matrix[i][i];
        }

        System.out.println("\nPrimary Diagonal Sum = " + primarySum);

        System.out.print("\nSecondary Diagonal: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(matrix[i][n - i - 1] + " ");
            secondarySum = secondarySum + matrix[i][n - i - 1];
        }

        System.out.println("\nSecondary Diagonal Sum = " + secondarySum);

        System.out.println("\nPrimary + Secondary Sum = " + (primarySum + secondarySum));

        int total = primarySum + secondarySum;
        if (n % 2 == 1) 
        {
            total = total - matrix[n / 2][n / 2];
        }
        System.out.println("Without double count = " + total);

    }
}
// Primary Diagonal: 1 5 9 
// Primary Diagonal Sum = 15

// Secondary Diagonal: 3 5 7
// Secondary Diagonal Sum = 15

// Primary + Secondary Sum = 30
// Without double count = 25