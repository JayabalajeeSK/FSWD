package Array;

import java.util.*;

public class ArrayList1DCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // 1D ArrayList Creation (All Ways)
        // ===============================
        ArrayList<Integer> list1 = new ArrayList<>();                    // empty list
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30)); // with elements
        // ArrayList<Integer> list3 = new ArrayList<>(list2);               // copy of another list
        // ArrayList<Integer> list4 = new ArrayList<>(50);                  // initial capacity

        // ===============================
        // ADD ELEMENTS
        // ===============================
        list1.add(5);        // add element
        list1.add(0, 1);     // add at index
        list1.addAll(list2); // add all
        list1.addAll(2, list2); // add all at index
        System.out.println("After add: " + list1);

        // ===============================
        // ACCESS ELEMENTS
        // ===============================
        System.out.println("Get index 2: " + list1.get(2));
        list1.set(2, 99); // replace
        System.out.println("After set: " + list1);

        // ===============================
        // REMOVE ELEMENTS
        // ===============================
        list1.remove(0);              // remove by index
        list1.remove(Integer.valueOf(20)); // remove object
        list1.removeAll(Arrays.asList(10, 30)); // remove all
        System.out.println("After remove: " + list1);

        // ===============================
        // QUERY METHODS
        // ===============================
        System.out.println("Contains 99? " + list1.contains(99));
        System.out.println("IndexOf 99: " + list1.indexOf(99));
        System.out.println("LastIndexOf 99: " + list1.lastIndexOf(99));
        System.out.println("IsEmpty? " + list1.isEmpty());
        System.out.println("Size: " + list1.size());

        // ===============================
        // ITERATION METHODS
        // ===============================
        System.out.print("For loop: ");
        for(int i=0; i<list1.size(); i++) System.out.print(list1.get(i) + " ");
        System.out.println();

        System.out.print("Enhanced for loop: ");
        for(int x : list1) System.out.print(x + " ");
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        list1.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // ===============================
        // CONVERSION
        // ===============================
        Integer[] arr = list1.toArray(new Integer[0]); // ArrayList → Array
        System.out.println("Array from list: " + Arrays.toString(arr));

        ArrayList<Integer> listFromArr = new ArrayList<>(Arrays.asList(arr)); // Array → ArrayList
        System.out.println("List from array: " + listFromArr);

        // ===============================
        // CLEAR
        // ===============================
        list1.clear();
        System.out.println("After clear: " + list1);
    }
}

