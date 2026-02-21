package Array;

import java.util.*;
// import java.util.stream.*;

public class Int2DArrayCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // 2D ARRAY CREATION (ALL WAYS)
        // ===============================
        //int[][] arr1 = new int[2][3];             // declaration + allocation
        int[][] arr2 = {{1,2,3},{4,5,6}};         // literal
        //int[][] arr3 = new int[][]{{7,8},{9,10}}; // new keyword

        // ===============================
        // BASIC OPERATIONS
        // ===============================
        System.out.println("Rows: " + arr2.length);
        System.out.println("Cols (first row): " + arr2[0].length);

        // ===============================
        // ARRAYS CLASS METHODS
        // ===============================
        Arrays.sort(arr2[0]); // sort first row
        System.out.println("Sorted first row: " + Arrays.toString(arr2[0]));

        System.out.println("Binary Search in first row (2): " + Arrays.binarySearch(arr2[0], 2));

        int[][] copy2D = Arrays.copyOf(arr2, arr2.length);
        System.out.println("CopyOf 2D: " + Arrays.deepToString(copy2D));

        System.out.println("DeepEquals: " + Arrays.deepEquals(arr2, copy2D));

        int[][] filled2D = new int[2][2];
        for(int[] row : filled2D)
            Arrays.fill(row, 7);
        System.out.println("Filled 2D: " + Arrays.deepToString(filled2D));

        // ===============================
        // ITERATION (ALL WAYS)
        // ===============================
        // Nested for loop
        System.out.println("Nested for loop:");
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop
        System.out.println("Enhanced for loop:");
        for(int[] row : arr2) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // Stream API
        System.out.println("Stream API:");
        Arrays.stream(arr2).forEach(row -> System.out.println(Arrays.toString(row)));

        // ===============================
        // 2D ARRAY → COLLECTION
        // ===============================
        List<List<Integer>> list = Arrays.stream(arr2)
                                         .map(r -> Arrays.stream(r).boxed().toList())
                                         .toList();
        System.out.println("2D array → List of Lists: " + list);

        // ===============================
        // COLLECTION → 2D ARRAY
        // ===============================
        int[][] backArray = list.stream()
                                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                                .toArray(int[][]::new);
        System.out.println("List of Lists → 2D array: " + Arrays.deepToString(backArray));
    }
}
