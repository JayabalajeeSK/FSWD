package Array;

import java.util.*;

public class IntArrayCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // ARRAY CREATION (ALL WAYS)
        // ===============================
        int[] a1 = new int[5];                  // declaration + allocation
        int[] a2 = {10, 20, 30, 40};             // literal
       // int[] a3 = new int[]{5, 15, 25};         // new keyword
        int[][] a4 = {{1,2},{3,4}};              // 2D array

        // ===============================
        // BASIC OPERATIONS
        // ===============================
        System.out.println("Length: " + a2.length);

        // ===============================
        // ARRAYS CLASS METHODS
        // ===============================
        Arrays.sort(a2);
        System.out.println("Sorted: " + Arrays.toString(a2));

        System.out.println("Binary Search (30): " +
                Arrays.binarySearch(a2, 30));

        int[] copy1 = Arrays.copyOf(a2, a2.length);
        System.out.println("CopyOf: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOfRange(a2, 1, 3);
        System.out.println("CopyOfRange: " + Arrays.toString(copy2));

        System.out.println("Equals: " + Arrays.equals(a2, copy1));

        Arrays.fill(a1, 7);
        System.out.println("Filled: " + Arrays.toString(a1));

        System.out.println("DeepEquals (2D): " +
                Arrays.deepEquals(a4, new int[][]{{1,2},{3,4}}));

        System.out.println("DeepToString: " +
                Arrays.deepToString(a4));

        // ===============================
        // ITERATION
        // ===============================
        for (int i = 0; i < a2.length; i++)
            System.out.print(a2[i] + " ");
        System.out.println();

        for (int x : a2)
            System.out.print(x + " ");
        System.out.println();

        Arrays.stream(a2).forEach(System.out::print);
        System.out.println();

        // ===============================
        // int[] → COLLECTION
        // ===============================
        List<Integer> list =
                Arrays.stream(a2).boxed().toList();
        System.out.println("Array → List: " + list);

        // ===============================
        // COLLECTION → int[]
        // ===============================
        int[] backToArray =
                list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("List → int[]: " +
                Arrays.toString(backToArray));
    }
}

