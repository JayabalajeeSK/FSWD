package DSA_Demo.LinkedList.Manual;

public class LinkedListManual 
{
    public static void main(String[] args) 
    {
        // Create LinkedList
        MyLinkedListInt list = new MyLinkedListInt();

        // ----- Adding Elements -----
        list.add(10);          // addLast
        list.addFirst(5);      // addFirst
        list.addLast(20);      // addLast add-- changed
        list.add(1, 15);       // add at index 1
        list.offer(25);        // addLast (queue style)
        list.push(2);          // addFirst (stack style)







        System.out.println("Initial LinkedList (Forward):");
        list.printForward();   // Expected: 2 5 15 10 20 25

        System.out.println("Initial LinkedList (Backward):");
        list.printBackward();  // Expected: 25 20 10 15 5 2










        // ----- Accessing Elements -----
        System.out.println("First Element: " + list.getFirst());  // 2
        System.out.println("Last Element: " + list.getLast());    // 25
        System.out.println("Element at index 2: " + list.get(2)); // 15










        // ----- Removing Elements -----
        list.removeFirst();    // removes 2
        list.removeLast();     // removes 25
        list.remove(1);        // removes 10
        list.removeValue(15);  // removes 15

        System.out.println("LinkedList after removals (Forward):");
        list.printForward();   // Expected: 5 20










        // ----- Searching -----
        System.out.println("Contains 5? " + list.contains(5));   // true
        System.out.println("Index of 20: " + list.indexOf(20));  // 1














        // ----- Replacing Elements -----
        list.set(0, 50);       // replace 5 with 50
        System.out.println("LinkedList after set (Forward):");
        list.printForward();   // Expected: 50 20











        // ----- Stack / Queue Methods -----
        list.push(100);        // addFirst
        System.out.println("After push 100:");
        list.printForward();   // Expected: 100 50 20

        System.out.println("Pop: " + list.pop());   // removes 100
        System.out.println("Peek: " + list.peek()); // 50

        System.out.println("Final LinkedList (Forward):");
        list.printForward();   // Expected: 50 20











        // ----- Size and Empty Check -----
        System.out.println("Size: " + list.size());    // 2
        System.out.println("Is empty? " + list.isEmpty()); // false

        list.removeAll();
        System.out.println("After removeAll:");
        list.printForward();   // No output
        System.out.println("Size: " + list.size()); // 0
        System.out.println("Is Empty: " + list.isEmpty()); // true

    }
}
// Initial LinkedList (Forward):
// 2 5 15 10 20 25 
// Initial LinkedList (Backward):
// 25 20 10 15 5 2 
// First Element: 2
// Last Element: 25
// Element at index 2: 15
// LinkedList after removals (Forward):
// 5 10 20
// Contains 5? true
// Index of 20: 2
// LinkedList after set (Forward):
// 50 10 20
// After push 100:
// 100 50 10 20
// Pop: 100
// Peek: 50
// Final LinkedList (Forward):
// 50 10 20 
// Size: 3
// Is empty? false