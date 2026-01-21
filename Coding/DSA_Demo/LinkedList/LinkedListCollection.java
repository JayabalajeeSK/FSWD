package DSA_Demo.LinkedList;

import java.util.*;

public class LinkedListCollection 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();

        // Adding
        list.add("Java");
        list.addFirst("Python");
        list.addLast("C++");
        list.add(1, "JavaScript");
        list.offer("Ruby");
        list.push("Go");

        System.out.println("LinkedList: " + list);

        // Accessing
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Peek: " + list.peek());

        // Removing
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        list.remove("Java");
        System.out.println("After Removals: " + list);

        // Searching
        System.out.println("Contains Python? " + list.contains("Python"));
        System.out.println("Index of Ruby: " + list.indexOf("Ruby"));

        // Iterating
        System.out.println("Iterating:");
        for(String s : list) System.out.println(s);

        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());

        // Replace
        if (!list.isEmpty()) list.set(0, "Scala");
        System.out.println("After set: " + list);
    }
}
// LinkedList: [Go, Python, JavaScript, Java, C++, Ruby]
// First: Go
// Last: Ruby
// Peek: Go
// After Removals: [Python, C++]
// Contains Python? true
// Index of Ruby: -1
// Iterating:
// Python
// C++
// Size: 2
// Is empty? false
// After set: [Scala, C++]