package Stack;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeStackAllMethods {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        stack.addFirst(40);
        stack.offerFirst(50);
        System.out.println("After addFirst & offerFirst: " + stack);

        System.out.println("PeekFirst: " + stack.peekFirst());
        System.out.println("PollFirst: " + stack.pollFirst());
        System.out.println("RemoveFirst: " + stack.removeFirst());

        System.out.println("Contains 20: " + stack.contains(20));
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());

        Iterator<Integer> it = stack.iterator();
        System.out.print("Elements: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        stack.clear();
        System.out.println("\nAfter clear: " + stack);
    }
}
