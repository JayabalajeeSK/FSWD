package Stack;

import java.util.Stack;
import java.util.Enumeration;

public class StackAllMethods {
    public static void main(String[] args) 
    {

        Stack<Integer> stack = new Stack<>();

        // Stack methods
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Search 10: " + stack.search(10));
        System.out.println("Empty: " + stack.empty());

        // Vector methods
        stack.add(40);
        stack.add(1, 50);
        System.out.println("After add: " + stack);

        System.out.println("Get index 1: " + stack.get(1));
        stack.set(1, 99);
        System.out.println("After set: " + stack);

        stack.remove(Integer.valueOf(99));
        System.out.println("After remove object: " + stack);

        stack.remove(0);
        System.out.println("After remove index: " + stack);

        System.out.println("Contains 20: " + stack.contains(20));
        System.out.println("Size: " + stack.size());
        System.out.println("Capacity: " + stack.capacity());
        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println("First Element: " + stack.firstElement());
        System.out.println("Last Element: " + stack.lastElement());
        System.out.println("Index Of 20: " + stack.indexOf(20));

        // Enumeration
        Enumeration<Integer> e = stack.elements();
        System.out.print("Elements: ");
        while (e.hasMoreElements()) 
        {
            System.out.print(e.nextElement() + " ");
        }

        stack.clear();
        System.out.println("\nAfter clear: " + stack);
    }
}
// Stack: [10, 20, 30]
// Peek: 30
// Pop: 30
// Search 10: 2
// Empty: false
// After add: [10, 50, 20, 40]
// Get index 1: 50
// After set: [10, 99, 20, 40]
// After remove object: [10, 20, 40]
// After remove index: [20, 40]
// Contains 20: true
// Size: 2
// Capacity: 10
// Is Empty: false
// First Element: 20
// Last Element: 40
// Index Of 20: 0
// Elements: 20 40
// After clear: []