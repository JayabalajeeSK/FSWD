package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class QueueUsingLinkedList {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Insert
        queue.add(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // View head
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());

        // Remove
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());

        // Collection methods
        System.out.println("Size: " + queue.size());
        System.out.println("Contains 20: " + queue.contains(20));
        System.out.println("Is Empty: " + queue.isEmpty());

        // Iterator
        Iterator<Integer> it = queue.iterator();
        System.out.print("Iterating: ");
        while (it.hasNext()) 
        {
            System.out.print(it.next() + " ");
        }

        // toArray
        Object[] arr = queue.toArray();
        System.out.println("\nArray: " + Arrays.toString(arr));

        // addAll
        Queue<Integer> temp = new LinkedList<>();
        temp.add(100);
        temp.add(200);
        queue.addAll(temp);
        System.out.println("After addAll: " + queue);

        // containsAll
        System.out.println("ContainsAll temp: " + queue.containsAll(temp));

        // removeAll
        queue.removeAll(temp);
        System.out.println("After removeAll: " + queue);

        // retainAll
        queue.add(500);
        queue.add(600);
        queue.retainAll(Arrays.asList(500));
        System.out.println("After retainAll: " + queue);

        // remove(Object)
        queue.remove(Integer.valueOf(500));
        System.out.println("After remove object: " + queue);

        // clear
        queue.clear();
        System.out.println("After clear: " + queue);
    }
}
// Queue: [10, 20, 30]
// Peek: 10
// Element: 10
// Poll: 10
// Remove: 20
// Size: 1
// Contains 20: false
// Is Empty: false
// Iterating: 30
// Array: [30]
// After addAll: [30, 100, 200]
// ContainsAll temp: true
// After removeAll: [30]
// After retainAll: [500]
// After remove object: []
// After clear: []