package Intermediate_Java.I2_Arrays;

import java.util.Scanner;

public class I2_ArraysDynamic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------------
        // 1D ARRAY
        // -------------------------
        System.out.print("Enter size of 1D array: ");
        int n = sc.nextInt();

        int[] oneD = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            oneD[i] = sc.nextInt();
        }

        System.out.println("\n1D Array:");
        for (int x : oneD)
            System.out.println(x);

        // -------------------------
        // 2D ARRAY
        // -------------------------
        System.out.print("\nEnter number of rows for 2D array: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] twoD = new int[rows][cols];

        System.out.println("Enter elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n2D Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------------
        // JAGGED ARRAY
        // -------------------------
        System.out.print("\nEnter number of rows for Jagged array: ");
        int jagRows = sc.nextInt();

        int[][] jagged = new int[jagRows][];

        for (int i = 0; i < jagRows; i++) {
            System.out.print("Enter number of columns in row " + (i+1) + ": ");
            int colSize = sc.nextInt();
            jagged[i] = new int[colSize];

            System.out.println("Enter values for row " + (i+1) + ":");
            for (int j = 0; j < colSize; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------------
        // LENGTH DETAILS
        // -------------------------
        System.out.println("\nLength of 1D Array: " + oneD.length);
        System.out.println("Rows in 2D Array: " + twoD.length);
        System.out.println("Columns in first row of 2D: " + twoD[0].length);

        sc.close();
    }
}
// Enter size of 1D array: 5
// Enter 5 elements:
// 1 3 4 6 6

// 1D Array:
// 1
// 3
// 4
// 6
// 6

// Enter number of rows for 2D array: 3
// Enter number of columns: 2
// Enter elements row by row:
// 1 2
// 1 4
// 4 6

// 2D Array:
// 1 2
// 1 4
// 4 6

// Enter number of rows for Jagged array: 4
// Enter number of columns in row 1: 4
// Enter values for row 1:
// 1 2 3 4
// Enter number of columns in row 2: 2
// Enter values for row 2:
// 1 7
// Enter number of columns in row 3: 6
// Enter values for row 3:
// 1 4 7 8 3 8
// Enter number of columns in row 4: 1
// Enter values for row 4:
// 4

// Jagged Array:
// 1 2 3 4
// 1 7
// 1 4 7 8 3 8
// 4

// Length of 1D Array: 5
// Rows in 2D Array: 3
// Columns in first row of 2D: 2
