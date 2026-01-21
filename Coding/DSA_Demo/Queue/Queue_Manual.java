package DSA_Demo.Queue;

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
   QUEUE CLASS (MANUAL)
   ========================= */
class MyQueue
{
    private Node front;
    private Node rear;
    private int size;

    public MyQueue()
    {
        front = rear = null;
        size = 0;
    }

    /****************************************************
     *                 ADD / OFFER
     ****************************************************/

    // add(e)
    public void add(int data)
    {
        offer(data);
    }

    // offer(e)
    public boolean offer(int data)
    {
        Node newNode = new Node(data);

        if (rear == null)
        {
            front = rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        return true;
    }

    /****************************************************
     *                 ACCESS
     ****************************************************/

    // peek()
    public int peek()
    {
        if (isEmpty())
            return -1;

        return front.data;
    }

    // element()
    public int element()
    {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        return front.data;
    }

    /****************************************************
     *                 REMOVE
     ****************************************************/

    // poll()
    public int poll()
    {
        if (isEmpty())
            return -1;

        int value = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        size--;
        return value;
    }

    // remove()
    public int remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        return poll();
    }

    /****************************************************
     *              COLLECTION METHODS
     ****************************************************/

    // contains(o)
    public boolean contains(int data)
    {
        Node current = front;
        while (current != null)
        {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }

    // size()
    public int size()
    {
        return size;
    }

    // isEmpty()
    public boolean isEmpty()
    {
        return size == 0;
    }

    // clear()
    public void clear()
    {
        front = rear = null;
        size = 0;
    }

    // addAll(array)
    public void addAll(int[] arr)
    {
        for (int val : arr)
        {
            offer(val);
        }
    }

    // removeAll(array)
    public void removeAll(int[] arr)
    {
        for (int val : arr)
        {
            removeValue(val);
        }
    }

    // retainAll(array)
    public void retainAll(int[] arr)
    {
        MyQueue temp = new MyQueue();

        for (int val : arr)
        {
            if (contains(val))
                temp.offer(val);
        }

        clear();
        this.front = temp.front;
        this.rear = temp.rear;
        this.size = temp.size;
    }

    // remove(Object)
    public boolean removeValue(int data)
    {
        Node current = front;
        Node prev = null;

        while (current != null)
        {
            if (current.data == data)
            {
                if (current == front)
                    poll();
                else
                {
                    prev.next = current.next;
                    if (current == rear)
                        rear = prev;
                    size--;
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    /****************************************************
     *                 ITERATION
     ****************************************************/

    public void printQueue()
    {
        Node current = front;
        System.out.print("FRONT -> ");

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("<- REAR");
    }
}

/* =========================
   MAIN CLASS
   ========================= */
public class Queue_Manual
{
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();

        /************ ADD / OFFER ************/
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        queue.printQueue();

        /************ ACCESS ************/
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());

        /************ REMOVE ************/
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());
        queue.printQueue();

        /************ COLLECTION METHODS ************/
        queue.offer(40);
        queue.offer(50);

        int[] arr = {60, 70};
        queue.addAll(arr);
        queue.printQueue();

        System.out.println("Contains 40? " + queue.contains(40));

        queue.removeValue(50);
        queue.printQueue();

        queue.removeAll(new int[]{40, 60});
        queue.printQueue();

        queue.retainAll(new int[]{20, 70});
        queue.printQueue();

        /************ SIZE / EMPTY ************/
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty? " + queue.isEmpty());

        /************ CLEAR ************/
        queue.clear();
        queue.printQueue();
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}

// FRONT -> 10 20 30 <- REAR
// Peek: 10
// Element: 10
// Poll: 10
// Remove: 20
// FRONT -> 30 <- REAR
// FRONT -> 30 40 50 60 70 <- REAR
// Contains 40? true
// FRONT -> 30 40 60 70 <- REAR
// FRONT -> 30 70 <- REAR
// FRONT -> 70 <- REAR
// Size: 1
// Is Empty? false
// FRONT -> <- REAR
// Is Empty? true