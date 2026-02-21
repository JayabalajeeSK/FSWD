package Heap;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;

public class MaxHeapAllMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Insert
        maxHeap.add(10);
        maxHeap.offer(40);
        maxHeap.offer(20);
        maxHeap.offer(30);

        System.out.println("Max Heap: " + maxHeap);

        // Peek / Element
        System.out.println("Peek: " + maxHeap.peek());
        System.out.println("Element: " + maxHeap.element());

        // Remove
        System.out.println("Poll: " + maxHeap.poll());
        System.out.println("Remove: " + maxHeap.remove());

        // Collection methods
        System.out.println("Size: " + maxHeap.size());
        System.out.println("Contains 20: " + maxHeap.contains(20));
        System.out.println("Is Empty: " + maxHeap.isEmpty());

        // Iterator
        Iterator<Integer> it = maxHeap.iterator();
        System.out.print("Iterating: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // toArray
        Object[] arr = maxHeap.toArray();
        System.out.println("\nArray: " + Arrays.toString(arr));

        // addAll
        PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());
        temp.add(100);
        temp.add(200);
        maxHeap.addAll(temp);
        System.out.println("After addAll: " + maxHeap);

        // containsAll
        System.out.println("ContainsAll temp: " + maxHeap.containsAll(temp));

        // removeAll
        maxHeap.removeAll(temp);
        System.out.println("After removeAll: " + maxHeap);

        // retainAll
        maxHeap.add(500);
        maxHeap.add(600);
        maxHeap.retainAll(Arrays.asList(500));
        System.out.println("After retainAll: " + maxHeap);

        // clear
        maxHeap.clear();
        System.out.println("After clear: " + maxHeap);
    }
}
