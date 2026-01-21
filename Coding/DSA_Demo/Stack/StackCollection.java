package DSA_Demo.Stack;

import java.util.*;

public class StackCollection
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        /****************************************************
         *                  ADD METHODS
         ****************************************************/
        stack.push(10);        // stack method
        stack.push(20);
        stack.push(30);

        stack.add(40);         // collection method
        stack.addElement(50);  // vector method

        System.out.println("After ADD:");
        System.out.println(stack);

        /****************************************************
         *                  GET METHODS
         ****************************************************/
        System.out.println("Peek: " + stack.peek());
        System.out.println("Get index 2: " + stack.get(2));
        System.out.println("First Element: " + stack.firstElement());
        System.out.println("Last Element: " + stack.lastElement());

        /****************************************************
         *                  REMOVE METHODS
         ****************************************************/
        System.out.println("Pop: " + stack.pop());
        stack.remove(1);
        stack.remove(Integer.valueOf(10));

        System.out.println("After REMOVE:");
        System.out.println(stack);

        /****************************************************
         *               SEARCH / CHECK METHODS
         ****************************************************/
        System.out.println("Contains 20? " + stack.contains(20));
        System.out.println("Search 20: " + stack.search(20)); // 1-based
        System.out.println("IndexOf 20: " + stack.indexOf(20));

        /****************************************************
         *                  SIZE METHODS
         ****************************************************/
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty? " + stack.isEmpty());

        /****************************************************
         *               ITERATION METHODS
         ****************************************************/
        System.out.println("Using for-each:");
        for (int val : stack)
        {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Using Iterator:");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        /****************************************************
         *              COLLECTION METHODS
         ****************************************************/
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(100);
        stack2.push(200);

        stack.addAll(stack2);
        System.out.println("After addAll:");
        System.out.println(stack);

        stack.removeAll(stack2);
        System.out.println("After removeAll:");
        System.out.println(stack);

        stack.clear();
        System.out.println("After clear:");
        System.out.println(stack);

        System.out.println("Is Empty? " + stack.isEmpty());
    }
}

// After ADD:
// [10, 20, 30, 40, 50]
// Peek: 50
// Get index 2: 30
// First Element: 10
// Last Element: 50
// Pop: 50
// After REMOVE:
// [30, 40]
// Contains 20? false
// Search 20: -1
// IndexOf 20: -1
// Size: 2
// Is Empty? false
// Using for-each:
// 30 40
// Using Iterator:
// 30 40
// After addAll:
// [30, 40, 100, 200]
// After removeAll:
// [30, 40]
// After clear:
// []
// Is Empty? true