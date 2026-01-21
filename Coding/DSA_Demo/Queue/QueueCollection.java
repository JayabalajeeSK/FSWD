package DSA_Demo.Queue;

import java.util.*;

public class QueueCollection
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();

        /************ ADD / OFFER ************/
        queue.add(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        /************ ACCESS ************/
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());

        /************ REMOVE ************/
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());

        System.out.println("After remove: " + queue);

        /************ COLLECTION METHODS ************/
        queue.add(40);
        queue.add(50);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(100);
        q2.add(200);

        queue.addAll(q2);
        System.out.println("After addAll: " + queue);

        System.out.println("Contains 40? " + queue.contains(40));
        System.out.println("ContainsAll q2? " + queue.containsAll(q2));

        queue.remove(Integer.valueOf(100));
        System.out.println("After remove object: " + queue);

        queue.removeAll(q2);
        System.out.println("After removeAll q2: " + queue);

        queue.retainAll(Arrays.asList(40, 50));
        System.out.println("After retainAll: " + queue);

        /************ ITERATION ************/
        System.out.print("Iterating: ");
        for (int val : queue)
        {
            System.out.print(val + " ");
        }
        System.out.println();

        /************ SIZE / EMPTY ************/
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty? " + queue.isEmpty());

        /************ CLEAR ************/
        queue.clear();
        System.out.println("After clear: " + queue);
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}
// Queue: [10, 20, 30]
// Peek: 10
// Element: 10
// Poll: 10
// Remove: 20
// After remove: [30]
// After addAll: [30, 40, 50, 100, 200]
// Contains 40? true
// ContainsAll q2? true
// After remove object: [30, 40, 50, 200]
// After removeAll q2: [30, 40, 50]
// After retainAll: [40, 50]
// Iterating: 40 50
// Size: 2
// Is Empty? false
// After clear: []
// Is Empty? true