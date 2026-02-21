package LinkedList;


import java.util.Iterator;
import java.util.NoSuchElementException;

class ListNode 
{
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MyLinkedList implements Iterable<Integer> 
{
    private ListNode head;

    public MyLinkedList() 
    {
        head = null;
    }

    // ------------------------------
    // Add Methods
    // ------------------------------
    public void add(int val) 
    { // add at end
        ListNode newNode = new ListNode(val);
        if(head == null) 
        {
            head = newNode;
            return;
        }
        ListNode temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
    }

    public void add(int index, int val) 
    { // add at index
        if(index < 0) throw new IndexOutOfBoundsException();

        ListNode newNode = new ListNode(val);

        if(index == 0) 
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode temp = head;
        for(int i=0; i<index-1; i++) 
        {
            if(temp == null) throw new IndexOutOfBoundsException();
            temp = temp.next;
        }

        newNode.next = temp.next;

        temp.next = newNode;
    }

    public void addFirst(int val) 
    {
        ListNode newNode = new ListNode(val);

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int val) { add(val); }

    // ------------------------------
    // Remove Methods
    // ------------------------------
    public void removeFirst() 
    {
        if(head != null) head = head.next;
    }

    public void removeLast() 
    {
        if(head == null) return;

        if(head.next == null) { head = null; return; }

        ListNode temp = head;

        while(temp.next.next != null) temp = temp.next;

        temp.next = null;
    }

    public void remove(int index) 
    {
        if(head == null) return;

        if(index == 0) { head = head.next; return; }

        ListNode temp = head;

        for(int i=0; i<index-1; i++) 
        {
            if(temp.next == null) return;

            temp = temp.next;
        }

        if(temp.next != null) temp.next = temp.next.next;
    }

    public void removeByValue(int val) 
    {
        if(head == null) return;

        if(head.val == val) { head = head.next; return; }

        ListNode temp = head;

        while(temp.next != null && temp.next.val != val) temp = temp.next;

        if(temp.next != null) temp.next = temp.next.next;
    }

    // ------------------------------
    // Get / Set Methods
    // ------------------------------
    public int get(int index) 
    {
        ListNode temp = head;

        for(int i=0; i<index; i++) 
        {
            if(temp == null) throw new IndexOutOfBoundsException();
            temp = temp.next;
        }
        
        if(temp == null) throw new IndexOutOfBoundsException();

        return temp.val;
    }

    public int getFirst() 
    {
        if(head == null) throw new IndexOutOfBoundsException();

        return head.val;
    }

    public int getLast() 
    {
        if(head == null) throw new IndexOutOfBoundsException();

        ListNode temp = head;

        while(temp.next != null) temp = temp.next;

        return temp.val;
    }

    public void set(int index, int val) 
    {
        ListNode temp = head;

        for(int i=0; i<index; i++) 
        {
            if(temp == null) throw new IndexOutOfBoundsException();

            temp = temp.next;
        }
        if(temp == null) throw new IndexOutOfBoundsException();

        temp.val = val;
    }

    // ------------------------------
    // Search / Size / Check
    // ------------------------------
    public boolean contains(int val) 
    {
        ListNode temp = head;

        while(temp != null) 
        {
            if(temp.val == val) return true;

            temp = temp.next;
        }
        return false;
    }

    public int indexOf(int val) 
    {
        ListNode temp = head;

        int index = 0;

        while(temp != null) 
        {
            if(temp.val == val) return index;

            temp = temp.next;

            index++;
        }
        return -1;
    }

    public boolean isEmpty() { return head == null; }

    public int size() 
    {
        int count = 0;

        ListNode temp = head;

        while(temp != null) { count++; temp = temp.next; }

        return count;
    }

    // ------------------------------
    // Stack Methods
    // ------------------------------
    public void push(int val) { addFirst(val); }

    public int pop() 
    {
        if(head == null) throw new NoSuchElementException();

        int val = head.val;

        head = head.next;

        return val;
    }

    // ------------------------------
    // Queue Methods
    // ------------------------------
    public void offer(int val) { addLast(val); }

    public void offerFirst(int val) { addFirst(val); }

    public void offerLast(int val) { addLast(val); }

    public int poll() 
    { // remove first
        if(head == null) return -1;

        int val = head.val;

        head = head.next;

        return val;
    }

    public int pollLast() 
    {
        if(head == null) return -1;

        if(head.next == null) { int val = head.val; head = null; return val; }

        ListNode temp = head;

        while(temp.next.next != null) temp = temp.next;

        int val = temp.next.val;

        temp.next = null;

        return val;
    }

    // ------------------------------
    // Peek Methods
    // ------------------------------
    public int peek() { return head != null ? head.val : -1; }

    public int peekFirst() { return peek(); }

    public int peekLast() 
    { 
        if(head == null) return -1;

        ListNode temp = head;

        while(temp.next != null) temp = temp.next;

        return temp.val;
    }

    // ------------------------------
    // Clear
    // ------------------------------
    public void clear() { head = null; }

    // ------------------------------
    // Iteration
    // ------------------------------
    @Override
    public Iterator<Integer> iterator() 
    {
        return new Iterator<Integer>() 
        {
            ListNode current = head;

            @Override
            public boolean hasNext() { return current != null; }

            @Override
            public Integer next() 
            {
                if(current == null) throw new NoSuchElementException();

                int val = current.val;

                current = current.next;

                return val;
            }
        };
    }

    // Helper method to print the list
    public void printList() 
    {
        ListNode temp = head;

        while(temp != null) 
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ------------------------------
    // Main for testing
    // ------------------------------
    public static void main(String[] args) 
    {
        MyLinkedList list = new MyLinkedList();

        // Initialize from array instead of multiple add calls
        int[] data = {10, 20, 30, 40, 50};
        for(int num : data)
        {
            list.add(num);
        }

        // Existing methods will still work
        list.addFirst(5);

        list.addLast(60);

        list.add(2, 15);

        list.printList(); // 5 -> 10 -> 15 -> 20 -> 30 -> 40 -> 50 -> 60 -> null

        // Remove
        list.removeFirst();

        list.removeLast();

        list.remove(1);

        list.removeByValue(20);

        list.printList(); // Remaining elements

        // Get/Set
        list.set(0, 100);

        System.out.println("First: " + list.getFirst());

        System.out.println("Last: " + list.getLast());

        System.out.println("Element at index 0: " + list.get(0));

        // Search / Size
        System.out.println("Contains 15? " + list.contains(15));

        System.out.println("Index of 100: " + list.indexOf(100));

        System.out.println("Is empty? " + list.isEmpty());

        System.out.println("Size: " + list.size());

        // Stack / Queue
        list.push(200);

        System.out.println("Popped: " + list.pop());

        list.offer(300);

        list.offerFirst(50);

        list.offerLast(400);

        System.out.println("Peek first: " + list.peekFirst());

        System.out.println("Peek last: " + list.peekLast());

        // Iterate
        System.out.print("Iterate list: ");

        for(int val : list) System.out.print(val + " ");

        System.out.println();

        // Clear
        list.clear();
        
        System.out.println("After clear, is empty? " + list.isEmpty());
    }
}
// 5 -> 10 -> 15 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
// 10 -> 30 -> 40 -> 50 -> null
// First: 100
// Last: 50
// Element at index 0: 100
// Contains 15? false
// Index of 100: 0
// Is empty? false
// Size: 4
// Popped: 200
// Peek first: 50
// Peek last: 400
// Iterate list: 50 100 30 40 50 300 400
// After clear, is empty? true