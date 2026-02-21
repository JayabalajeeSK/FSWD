package Array;

import java.util.*;

public class ArrayList2DCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // 2D ArrayList Creation (All Ways)
        // ===============================
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // Adding rows dynamically
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4,5,6));
        list2D.add(row1);
        list2D.add(row2);

        // Another way
        list2D.add(new ArrayList<>(Arrays.asList(7,8,9)));

        System.out.println("2D ArrayList: " + list2D);

        // ===============================
        // ACCESS ELEMENTS
        // ===============================
        System.out.println("Element at (0,1): " + list2D.get(0).get(1));

        // Modify element
        list2D.get(0).set(1, 99);
        System.out.println("After modification: " + list2D);

        // ===============================
        // ADD ELEMENTS
        // ===============================
        list2D.get(1).add(10); // add to specific row
        list2D.add(new ArrayList<>(Arrays.asList(11,12))); // add new row
        System.out.println("After add: " + list2D);

        // ===============================
        // REMOVE ELEMENTS
        // ===============================
        list2D.get(0).remove(Integer.valueOf(99)); // remove from row
        list2D.remove(2);                          // remove row
        System.out.println("After remove: " + list2D);

        // ===============================
        // ITERATION
        // ===============================
        System.out.println("Nested for loop:");
        for(int i=0; i<list2D.size(); i++) {
            for(int j=0; j<list2D.get(i).size(); j++)
                System.out.print(list2D.get(i).get(j) + " ");
            System.out.println();
        }

        System.out.println("Enhanced for loop:");
        for(ArrayList<Integer> row : list2D)
            for(Integer x : row)
                System.out.print(x + " ");
        System.out.println();

        System.out.println("ForEach:");
        list2D.forEach(row -> row.forEach(x -> System.out.print(x + " ")));
        System.out.println();

        // ===============================
        // CONVERSION 2D ArrayList → 2D Array
        // ===============================
        int rows = list2D.size();
        int[][] arr2D = new int[rows][];
        for(int i=0; i<rows; i++) {
            arr2D[i] = list2D.get(i).stream().mapToInt(Integer::intValue).toArray();
        }
        System.out.println("2D array: " + Arrays.deepToString(arr2D));

        // Conversion 2D Array → 2D ArrayList
        ArrayList<ArrayList<Integer>> listFromArr = new ArrayList<>();
        for(int[] row : arr2D) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int x : row) temp.add(x);
            listFromArr.add(temp);
        }
        System.out.println("2D ArrayList from array: " + listFromArr);

        // ===============================
        // CLEAR
        // ===============================
        list2D.clear();
        System.out.println("After clear: " + list2D);
    }
}

// 2D ArrayList: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Element at (0,1): 2
// After modification: [[1, 99, 3], [4, 5, 6], [7, 8, 9]]
// After add: [[1, 99, 3], [4, 5, 6, 10], [7, 8, 9], [11, 12]]
// After remove: [[1, 3], [4, 5, 6, 10], [11, 12]]
// Nested for loop:
// 1 3
// 4 5 6 10
// 11 12
// Enhanced for loop:
// 1 3 4 5 6 10 11 12
// ForEach:
// 1 3 4 5 6 10 11 12
// 2D array: [[1, 3], [4, 5, 6, 10], [11, 12]]
// 2D ArrayList from array: [[1, 3], [4, 5, 6, 10], [11, 12]]
// After clear: []