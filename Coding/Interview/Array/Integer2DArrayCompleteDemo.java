package Array;

import java.util.*;
// import java.util.stream.*;

public class Integer2DArrayCompleteDemo 
{
    public static void main(String[] args) {

        // ===============================
        // 2D ARRAY CREATION (ALL WAYS)
        // ===============================
        // Integer[][] arr1 = new Integer[2][2];
        Integer[][] arr2 = {{1,2},{3,4}};
        // Integer[][] arr3 = new Integer[][]{{5,6},{7,8}};

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

        Integer[][] copy2D = Arrays.copyOf(arr2, arr2.length);
        System.out.println("CopyOf 2D: " + Arrays.deepToString(copy2D));

        System.out.println("DeepEquals: " + Arrays.deepEquals(arr2, copy2D));

        Integer[][] filled2D = new Integer[2][2];
        for(Integer[] row : filled2D)
            Arrays.fill(row, 99);
        System.out.println("Filled 2D: " + Arrays.deepToString(filled2D));

        // ===============================
        // ITERATION (ALL WAYS)
        // ===============================
        System.out.println("Nested for loop:");
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced for loop:");
        for(Integer[] row : arr2) {
            for(Integer x : row)
                System.out.print(x + " ");
            System.out.println();
        }

        System.out.println("Stream API:");
        Arrays.stream(arr2).forEach(row -> System.out.println(Arrays.toString(row)));

        // ===============================
        // 2D ARRAY → COLLECTION
        // ===============================
        List<List<Integer>> list = Arrays.stream(arr2)
                                         .map(r -> Arrays.asList(r))
                                         .toList();
        System.out.println("2D Integer array → List of Lists: " + list);

        // ===============================
        // COLLECTION → 2D ARRAY
        // ===============================
        Integer[][] backArray = list.stream()
                                    .map(l -> l.toArray(new Integer[0]))
                                    .toArray(Integer[][]::new);
        System.out.println("List of Lists → 2D Integer array: " + Arrays.deepToString(backArray));
    }
}
