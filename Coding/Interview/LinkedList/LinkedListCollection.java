package LinkedList;
import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        // ------------------------------
        // 1️⃣ Create LinkedList
        // ------------------------------
        LinkedList<Integer> list = new LinkedList<>();

        // ------------------------------
        // 2️⃣ Add Elements
        // ------------------------------
        list.add(10);            // add at end
        list.add(20);
        list.add(30);
        list.addFirst(5);        // add at beginning
        list.addLast(40);        // add at end
        list.add(2, 15);         // add at index
        System.out.println("After add: " + list); // [5, 10, 15, 20, 30, 40]

        // ------------------------------
        // 3️⃣ Get Elements
        // ------------------------------
        System.out.println("First element: " + list.getFirst()); // 5
        System.out.println("Last element: " + list.getLast());   // 40
        System.out.println("Element at index 3: " + list.get(3)); // 20

        // ------------------------------
        // 4️⃣ Remove Elements
        // ------------------------------
        list.remove();            // remove first element
        list.removeFirst();       // remove first
        list.removeLast();        // remove last
        list.remove(1);           // remove element at index
        list.remove(Integer.valueOf(20)); // remove by value
        System.out.println("After remove: " + list); // Remaining elements

        // ------------------------------
        // 5️⃣ Set / Update Elements
        // ------------------------------
        list.set(0, 100); // update element at index
        System.out.println("After set: " + list);

        // ------------------------------
        // 6️⃣ Search / Check
        // ------------------------------
        System.out.println("Contains 15? " + list.contains(15));
        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Is Empty? " + list.isEmpty());

        // ------------------------------
        // 7️⃣ Size
        // ------------------------------
        System.out.println("Size: " + list.size());

        // ------------------------------
        // 8️⃣ Iteration
        // ------------------------------
        System.out.println("Iterate using for-each:");
        for(int val : list) System.out.print(val + " ");
        System.out.println();

        System.out.println("Iterate using iterator:");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        System.out.println("Iterate using descendingIterator:");
        Iterator<Integer> dit = list.descendingIterator();
        while(dit.hasNext()) System.out.print(dit.next() + " ");
        System.out.println();

        // ------------------------------
        // 9️⃣ Stack-like Methods
        // ------------------------------
        list.push(200);      // push at head
        System.out.println("After push: " + list);
        int popped = list.pop();  // remove first element
        System.out.println("Popped element: " + popped);
        System.out.println("After pop: " + list);

        // ------------------------------
        // 🔟 Queue-like Methods
        // ------------------------------
        list.offer(300);         // add at end
        list.offerFirst(50);     // add at beginning
        list.offerLast(400);     // add at end
        System.out.println("After offer methods: " + list);

        System.out.println("Poll first: " + list.poll()); // remove first
        System.out.println("Poll last: " + list.pollLast()); // remove last
        System.out.println("After poll: " + list);

        // ------------------------------
        // 1️⃣1️⃣ Peek Methods
        // ------------------------------
        System.out.println("Peek first: " + list.peek());       // first element
        System.out.println("Peek last: " + list.peekLast());    // last element

        // ------------------------------
        // 1️⃣2️⃣ Clear List
        // ------------------------------
        list.clear();
        System.out.println("After clear, is empty? " + list.isEmpty());
    }
}

