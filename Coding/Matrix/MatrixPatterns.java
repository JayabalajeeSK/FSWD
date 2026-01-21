package Matrix;

public class MatrixPatterns 
{

    // 1. Snake Pattern (Left to Right)
    static void snakeLeftToRight(int[][] arr) 
    {
        int r = arr.length, c = arr[0].length;
        System.out.println("\nSnake Pattern (Left to Right):");
        for (int i = 0; i < r; i++) 
        {
            if (i % 2 == 0) 
            {
                for (int j = 0; j < c; j++) System.out.print(arr[i][j] + " ");
            } 
            else 
            {
                for (int j = c - 1; j >= 0; j--) System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. Snake Pattern (Right to Left)
    static void snakeRightToLeft(int[][] arr) 
    {
        int r = arr.length, c = arr[0].length;
        System.out.println("\nSnake Pattern (Right to Left):");
        for (int i = 0; i < r; i++) 
        {
            if (i % 2 == 0) 
            {
                for (int j = c - 1; j >= 0; j--) System.out.print(arr[i][j] + " ");
            } 
            else 
            {
                for (int j = 0; j < c; j++) System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3. Outer Border
    static void outerBorder(int[][] arr) 
    {
        int r = arr.length, c = arr[0].length;
        System.out.println("\nOuter Border:");
        
        // Top row
        for (int j = 0; j < c; j++) System.out.print(arr[0][j] + " ");

        // Right column
        for (int i = 1; i < r; i++) System.out.print(arr[i][c - 1] + " ");

        // Bottom row
        if (r > 1) 
        {
            for (int j = c - 2; j >= 0; j--) System.out.print(arr[r - 1][j] + " ");
        }

        // Left column
        if (c > 1) 
        {
            for (int i = r - 2; i > 0; i--) System.out.print(arr[i][0] + " ");
        }

        System.out.println();
    }

    // 4. Zigzag Pattern (Left to Right)
    static void zigzagLeftToRight(int[][] arr) 
    {
        int r = arr.length, c = arr[0].length;
        System.out.println("\nZigzag Pattern (Left to Right):");
        for (int j = 0; j < c; j++) 
        {
            if (j % 2 == 0) 
            {
                for (int i = 0; i < r; i++) System.out.print(arr[i][j] + " ");
            } 
            else 
            {
                for (int i = r - 1; i >= 0; i--) System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    // 5. Zigzag Pattern (Right to Left)
    static void zigzagRightToLeft(int[][] arr) 
    {
        int r = arr.length, c = arr[0].length;
        System.out.println("\nZigzag Pattern (Right to Left):");
        int count = 0;
        for (int j = c - 1; j >= 0; j--) 
        {
            if (count % 2 == 0) 
            {
                for (int i = 0; i < r; i++) System.out.print(arr[i][j] + " ");
            } 
            else 
            {
                for (int i = r - 1; i >= 0; i--) System.out.print(arr[i][j] + " ");
            }
            count++;
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) 
    {

        int[][] arr = 
        {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        snakeLeftToRight(arr);
        snakeRightToLeft(arr);
        outerBorder(arr);
        zigzagLeftToRight(arr);
        zigzagRightToLeft(arr);
    }
}
// Snake Pattern (Left to Right):
// 1 2 3 4 
// 8 7 6 5 
// 9 10 11 12 

// Snake Pattern (Right to Left):
// 4 3 2 1
// 5 6 7 8
// 12 11 10 9

// Outer Border:
// 1 2 3 4 8 12 11 10 9 5

// Zigzag Pattern (Left to Right):
// 1 5 9 10 6 2 3 7 11 12 8 4

// Zigzag Pattern (Right to Left):
// 4 8 12 11 7 3 2 6 10 9 5 1