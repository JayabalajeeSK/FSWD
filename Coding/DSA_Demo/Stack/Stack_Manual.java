package DSA_Demo.Stack;

import java.util.NoSuchElementException;

/* =========================
   NODE CLASS
   ========================= */
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

/* =========================
   STACK CLASS (ALL METHODS)
   ========================= */
class MyStack
{
    private Node top;
    private int size;

    public MyStack()
    {
        top = null;
        size = 0;
    }

    /************************************************************
     *                      STACK METHODS
     ************************************************************/

    // push(E e)
    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // pop()
    public int pop()
    {
        if (empty())
            throw new NoSuchElementException("Stack is empty");

        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // peek()
    public int peek()
    {
        if (empty())
            throw new NoSuchElementException("Stack is empty");

        return top.data;
    }

    // empty()
    public boolean empty()
    {
        return size == 0;
    }

    // search(Object o) → 1-based index from TOP
    public int search(int data)
    {
        Node current = top;
        int position = 1;

        while (current != null)
        {
            if (current.data == data)
                return position;

            current = current.next;
            position++;
        }
        return -1;
    }

    // size()
    public int size()
    {
        return size;
    }

    // clear()
    public void clear()
    {
        top = null;
        size = 0;
    }

    // print stack (top to bottom)
    public void printStack()
    {
        Node current = top;
        System.out.print("TOP -> ");

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/* =========================
   MAIN CLASS
   ========================= */
public class Stack_Manual
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();

        /************ PUSH ************/
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After push:");
        stack.printStack();

        /************ PEEK ************/
        System.out.println("Peek: " + stack.peek());

        /************ POP ************/
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop:");
        stack.printStack();

        /************ SEARCH ************/
        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Search 100: " + stack.search(100));

        /************ SIZE ************/
        System.out.println("Size: " + stack.size());

        /************ EMPTY ************/
        System.out.println("Is Empty? " + stack.empty());

        /************ CLEAR ************/
        stack.clear();
        System.out.println("After clear:");
        stack.printStack();
        System.out.println("Is Empty? " + stack.empty());
    }
}
// After push:
// TOP -> 40 30 20 10 
// Peek: 40
// Pop: 40
// After pop:
// TOP -> 30 20 10
// Search 20: 2
// Search 100: -1
// Size: 3
// Is Empty? false
// After clear:
// TOP ->
// Is Empty? true
