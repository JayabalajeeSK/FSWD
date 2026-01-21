package DSA_Demo.Heap;

import java.util.*;

public class HeapCollection
{
    public static void main(String[] args)
    {
        /**************** MIN HEAP ****************/
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        System.out.println("===== MIN HEAP =====");

        // ADD / OFFER
        minHeap.add(40);
        minHeap.add(10);
        minHeap.offer(30);
        minHeap.offer(20);

        System.out.println("Min Heap: " + minHeap);

        // ACCESS
        System.out.println("Peek: " + minHeap.peek());
        System.out.println("Element: " + minHeap.element());

        // REMOVE
        System.out.println("Poll: " + minHeap.poll());
        System.out.println("Remove: " + minHeap.remove());

        System.out.println("After remove: " + minHeap);

        // COLLECTION METHODS
        PriorityQueue<Integer> h2 = new PriorityQueue<>();
        h2.add(5);
        h2.add(15);

        minHeap.addAll(h2);
        System.out.println("After addAll: " + minHeap);

        System.out.println("Contains 20? " + minHeap.contains(20));
        System.out.println("ContainsAll h2? " + minHeap.containsAll(h2));

        minHeap.remove(Integer.valueOf(15));
        System.out.println("After remove object: " + minHeap);

        minHeap.removeAll(h2);
        System.out.println("After removeAll: " + minHeap);

        minHeap.retainAll(Arrays.asList(20, 30));
        System.out.println("After retainAll: " + minHeap);

        // ITERATION
        System.out.print("Iterating: ");
        for (int x : minHeap)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        // SIZE / EMPTY
        System.out.println("Size: " + minHeap.size());
        System.out.println("Is Empty? " + minHeap.isEmpty());

        // CLEAR
        minHeap.clear();
        System.out.println("After clear: " + minHeap);
        System.out.println("Is Empty? " + minHeap.isEmpty());

        /**************** MAX HEAP ****************/
        System.out.println("\n===== MAX HEAP =====");

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);

        System.out.println("Max Heap: " + maxHeap);

        System.out.println("Peek: " + maxHeap.peek());
        System.out.println("Poll: " + maxHeap.poll());
        System.out.println("After poll: " + maxHeap);
    }
}
// ===== MIN HEAP =====
// Min Heap: [10, 20, 30, 40]
// Peek: 10
// Element: 10
// Poll: 10
// Remove: 20
// After remove: [30, 40]
// After addAll: [5, 15, 30, 40]
// Contains 20? false
// ContainsAll h2? true
// After remove object: [5, 40, 30]
// After removeAll: [30, 40]
// After retainAll: [30]
// Iterating: 30
// Size: 1
// Is Empty? false
// After clear: []
// Is Empty? true

// ===== MAX HEAP =====
// Max Heap: [50, 40, 20, 10]
// Peek: 50
// Poll: 50
// After poll: [40, 10, 20]