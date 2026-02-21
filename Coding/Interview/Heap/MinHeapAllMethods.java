package Heap;

import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Arrays;

public class MinHeapAllMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert
        minHeap.add(40);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(20);

        System.out.println("Min Heap: " + minHeap);

        // Peek / Element
        System.out.println("Peek: " + minHeap.peek());
        System.out.println("Element: " + minHeap.element());

        // Remove
        System.out.println("Poll: " + minHeap.poll());
        System.out.println("Remove: " + minHeap.remove());

        // Collection methods
        System.out.println("Size: " + minHeap.size());
        System.out.println("Contains 30: " + minHeap.contains(30));
        System.out.println("Is Empty: " + minHeap.isEmpty());

        // Iterator
        Iterator<Integer> it = minHeap.iterator();
        System.out.print("Iterating: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // toArray
        Object[] arr = minHeap.toArray();
        System.out.println("\nArray: " + Arrays.toString(arr));

        // addAll
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        temp.add(5);
        temp.add(15);
        minHeap.addAll(temp);
        System.out.println("After addAll: " + minHeap);

        // containsAll
        System.out.println("ContainsAll temp: " + minHeap.containsAll(temp));

        // removeAll
        minHeap.removeAll(temp);
        System.out.println("After removeAll: " + minHeap);

        // retainAll
        minHeap.add(50);
        minHeap.add(60);
        minHeap.retainAll(Arrays.asList(50));
        System.out.println("After retainAll: " + minHeap);

        // clear
        minHeap.clear();
        System.out.println("After clear: " + minHeap);
    }
}
