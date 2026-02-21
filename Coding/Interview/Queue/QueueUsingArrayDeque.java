package Queue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Arrays;

public class QueueUsingArrayDeque {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        // Insert
        queue.add(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue: " + queue);

        // Head operations
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());

        // Remove
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());

        // Collection methods
        System.out.println("Size: " + queue.size());
        System.out.println("Contains 2: " + queue.contains(2));
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
        Queue<Integer> temp = new ArrayDeque<>();
        temp.add(10);
        temp.add(20);
        queue.addAll(temp);
        System.out.println("After addAll: " + queue);

        // containsAll
        System.out.println("ContainsAll temp: " + queue.containsAll(temp));

        // removeAll
        queue.removeAll(temp);
        System.out.println("After removeAll: " + queue);

        // retainAll
        queue.add(100);
        queue.add(200);
        queue.retainAll(Arrays.asList(100));
        System.out.println("After retainAll: " + queue);

        // clear
        queue.clear();
        System.out.println("After clear: " + queue);
    }
}
// Queue: [1, 2, 3]
// Peek: 1
// Element: 1
// Poll: 1
// Remove: 2
// Size: 1
// Contains 2: false
// Is Empty: false
// Iterating: 3
// Array: [3]
// After addAll: [3, 10, 20]
// ContainsAll temp: true
// After removeAll: [3]
// After retainAll: [100]
// After clear: []