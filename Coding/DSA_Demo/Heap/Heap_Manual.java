package DSA_Demo.Heap;

class ManualHeap
{
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    ManualHeap(int capacity)
    {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // ---------- Utility ----------
    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }

    private void swap(int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // ---------- INSERT ----------
    public void insert(int value)
    {
        if (size == capacity)
        {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int index)
    {
        while (index > 0 && heap[parent(index)] > heap[index])
        {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // ---------- PEEK ----------
    public int peek()
    {
        if (isEmpty())
            throw new RuntimeException("Heap is empty");
        return heap[0];
    }

    // ---------- REMOVE ROOT ----------
    public int remove()
    {
        if (isEmpty())
            throw new RuntimeException("Heap is empty");

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    private void heapifyDown(int index)
    {
        int smallest = index;

        int left = left(index);
        int right = right(index);

        if (left < size && heap[left] < heap[smallest])
            smallest = left;

        if (right < size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != index)
        {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // ---------- SIZE ----------
    public int size()
    {
        return size;
    }

    // ---------- EMPTY ----------
    public boolean isEmpty()
    {
        return size == 0;
    }

    // ---------- CLEAR ----------
    public void clear()
    {
        size = 0;
    }

    // ---------- PRINT ----------
    public void printHeap()
    {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class Heap_Manual
{
    public static void main(String[] args)
    {
        ManualHeap heap = new ManualHeap(10);

        // INSERT
        heap.insert(40);
        heap.insert(10);
        heap.insert(30);
        heap.insert(20);
        heap.insert(5);

        heap.printHeap();

        // PEEK
        System.out.println("Peek: " + heap.peek());

        // REMOVE
        System.out.println("Removed: " + heap.remove());
        heap.printHeap();

        // SIZE
        System.out.println("Size: " + heap.size());

        // EMPTY
        System.out.println("Is Empty? " + heap.isEmpty());

        // CLEAR
        heap.clear();
        heap.printHeap();
        System.out.println("Is Empty? " + heap.isEmpty());
    }
}
