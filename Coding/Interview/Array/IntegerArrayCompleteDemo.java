package Array;

import java.util.*;
// import java.util.stream.*;

public class IntegerArrayCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // ARRAY CREATION (ALL WAYS)
        // ===============================
        Integer[] b1 = new Integer[5];
        Integer[] b2 = {10, 20, 30, 40};
        // Integer[] b3 = new Integer[]{5, 15, 25};

        // ===============================
        // BASIC OPERATIONS
        // ===============================
        System.out.println("Length: " + b2.length);

        // ===============================
        // ARRAYS CLASS METHODS
        // ===============================
        Arrays.sort(b2);
        System.out.println("Sorted: " + Arrays.toString(b2));

        System.out.println("Binary Search (30): " +
                Arrays.binarySearch(b2, 30));

        Integer[] copy = Arrays.copyOf(b2, b2.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        System.out.println("Equals: " + Arrays.equals(b2, copy));

        Arrays.fill(b1, 99);
        System.out.println("Filled: " + Arrays.toString(b1));

        // ===============================
        // ITERATION
        // ===============================
        for (int i = 0; i < b2.length; i++)
            System.out.print(b2[i] + " ");
        System.out.println();

        for (Integer x : b2)
            System.out.print(x + " ");
        System.out.println();

        Arrays.stream(b2).forEach(System.out::print);
        System.out.println();

        // ===============================
        // Integer[] → COLLECTION (ALL WAYS)
        // ===============================

        // Fixed-size list
        List<Integer> list1 = Arrays.asList(b2);

        // Modifiable list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(b2));

        // Stream
        List<Integer> list3 = Arrays.stream(b2).toList();

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);

        // ===============================
        // COLLECTION → ARRAY
        // ===============================
        Integer[] backArray =
                list2.toArray(new Integer[0]);
        System.out.println("List → Integer[]: " +
                Arrays.toString(backArray));
    }
}
// Length: 4
// Sorted: [10, 20, 30, 40]
// Binary Search (30): 2
// Copy: [10, 20, 30, 40]
// Equals: true
// Filled: [99, 99, 99, 99, 99]
// 10 20 30 40
// 10 20 30 40
// 10203040
// List1: [10, 20, 30, 40]
// List2: [10, 20, 30, 40]
// List3: [10, 20, 30, 40]
// List ? Integer[]: [10, 20, 30, 40]