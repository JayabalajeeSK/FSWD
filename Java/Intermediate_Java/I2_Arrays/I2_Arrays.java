package Intermediate_Java.I2_Arrays;

public class I2_Arrays {
    public static void main(String[] args) {

        // 1D Array
        int[] oneD = {10, 20, 30};

        System.out.println("1D Array:");
        for (int x : oneD) System.out.println(x);

        // 2D Array
        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n2D Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Array length
        System.out.println("\nLength of 1D: " + oneD.length);
        System.out.println("Rows in 2D: " + twoD.length);
        System.out.println("Columns in first row: " + twoD[0].length);
    }
}
// 1D Array:
// 10
// 20
// 30

// 2D Array:
// 1 2 3 
// 4 5 6

// Jagged Array:
// 1 2
// 3 4 5
// 6

// Length of 1D: 3
// Rows in 2D: 2
// Columns in first row: 3