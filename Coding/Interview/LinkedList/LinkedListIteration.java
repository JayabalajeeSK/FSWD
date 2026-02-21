package LinkedList;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIteration implements Iterable<Integer> {
    public ListNode head;

    public LinkedListIteration(ListNode head) {
        this.head = head;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            ListNode current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                if(!hasNext()) throw new NoSuchElementException();
                int val = current.val;
                current = current.next;
                return val;
            }
        };
    }
}
