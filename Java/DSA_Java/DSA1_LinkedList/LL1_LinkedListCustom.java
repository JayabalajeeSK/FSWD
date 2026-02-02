package DSA_Java.DSA1_LinkedList;

class Node 
{
    int data; //data
    Node next; //pointer to next Node

    Node(int data) 
    {
        this.data = data;
        this.next = null; //next null means no data initailly
    }
}
// int data, node next, intiall ha null vlaue in next, so constructor la appadi tharamam


// Add:
// Add(Element) - AddLast(Element)
// Add(Index, Element)
// AddFirst(Element)

// Get:
// Get(Index)
// GetFirst()
// GetLast()
// Peek()

// Set:
// Set(Index, Element)

// Remove:
// Remove() - RemoveFirst() - RemoveLast() [Remove(size -1)]
// Remove(Index);
// RemoveObject(Element)

// Search:
// contains(Element)
// indexOf(Element)
// lastIndexOf(Element)

// UtilityMethods:
// Size()
// isEmpty()
// clear()
// PrintList()

class CustomLinkedList 
{
 // indial ha node ku head create pannanum, kuda size , total evlo nu count apnn
    private Node head;
    private int size;

    // -------------------------------
    // Add Methods
    // -------------------------------

    // add(E e) — Add at end
    public void add(int data) // ipo aadd pann first data theva
    {
        Node newNode = new Node(data); // new node onu create pannanum

        if (head == null) //initial ha head null ha nu check pannum , appadi irutha head thaan new node
        {
            head = newNode;
        } 
        else //apppadi illana
        {
            Node temp = head; //temp nu oru node create panni, head thula podanum
            while (temp.next != null) // next temp.next athavathu head ku next ethvathu null irukanu check pannaum - so intha process contuie agum so while loop
            {
                temp = temp.next; // not null ha irutha temp head la ithuthu temp.next to move agum
            }
            temp.next = newNode; //next etha edathula null iruko ang new node place agum
        }
        size++; // then one node add achi na athoda size increase agum
    }

    // add(int index, E element) — Add at specific index
    public void add(int index, int data) // add dat with specific index so index and data
    {
        if (index < 0 || index > size) //ist lindex less than 0 or grater than size ha irutha - invalid return
        {
            System.out.println("Invalid index!");
            return;
        }

        Node newNode = new Node(data); // ilana newnode create pannithu athula data

        if (index == 0) // idex value 0, athavathu 1st la irutha 
        {
            newNode.next = head; //newnode ku next ku head
            head = newNode; // head ku new node ha replace
        } 
        else 
        {
            Node temp = head; // appadi 1st al illana , temp la head ha pothu traverse pannum
            for (int i = 0; i < index - 1; i++) // 10 20 30 40 50 - 0 1 2 3 4 - index 3 , 60
            // 0 < 3-1  - > 0<2 -> 0 , 1
            {
                temp = temp.next; // temp 0 ku pogum and 1 ku pogum - 10-> 20 then 20-> 30
            }
            newNode.next = temp.next;  // temp = 30 //newNode.next = temp.next = 30-> 40 , new node ku next 40
            temp.next = newNode; //so temp.next la new node -> 60, so 10 20 30 60 40 50
        }

        size++; // last ha size increment
    }

    // addFirst(E e)
    public void addFirst(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // addLast(E e)
    public void addLast(int data) 
    {
        add(data);
    }


    // -------------------------------
    // Get Methods
    // -------------------------------

    // get(index)
    public int get(int index) 
    {
        if (index < 0 || index >= size) 
        {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        for (int i = 0; i < index; i++) 
        {
            temp = temp.next;
        }
        return temp.data;
    }

    // getFirst()
    public int getFirst() 
    {
        if (head == null) throw new RuntimeException("List empty");
        return head.data;
    }

    // getLast()
    public int getLast() 
    {
        if (head == null) throw new RuntimeException("List empty");
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        return temp.data;
    }

    // peek() — Get head element but don’t remove
    public Integer peek() 
    {
        if (head == null) return null;
        return head.data;
    }


    // -------------------------------
    // Set Method
    // -------------------------------

    // set(index, value)
    public void set(int index, int data) 
    {
        if (index < 0 || index >= size) 
        {
            System.out.println("Invalid index");
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) 
        {
            temp = temp.next;
        }

        temp.data = data;
    }


    // -------------------------------
    // Remove Methods
    // -------------------------------

    // remove() — Remove first element
    public int remove() 
    {
        if (head == null) throw new RuntimeException("List empty");

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove(index)
    public int remove(int index) 
    {
        if (index < 0 || index >= size) 
        {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) 
        {
            return remove();
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) 
        {
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // remove(Object o)
    public boolean removeObject(int data) 
    {
        if (head == null) return false;

        if (head.data == data) 
        {
            head = head.next;
            size--;
            return true;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) 
        {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        temp.next = temp.next.next;
        size--;
        return true;
    }

    // removeFirst()
    public int removeFirst() 
    {
        return remove();
    }

    // removeLast()
    public int removeLast() 
    {
        return remove(size - 1);
    }


    // -------------------------------
    // Search Methods
    // -------------------------------

    // contains(Object o)
    public boolean contains(int data) 
    {
        Node temp = head;
        while (temp != null) 
        {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    // indexOf(Object o)
    public int indexOf(int data) 
    {
        Node temp = head;
        int index = 0;

        while (temp != null) 
        {
            if (temp.data == data) return index;
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // lastIndexOf(Object o)
    public int lastIndexOf(int data) 
    {
        Node temp = head;
        int index = 0;
        int lastIndex = -1;

        while (temp != null) 
        {
            if (temp.data == data) lastIndex = index;
            temp = temp.next;
            index++;
        }

        return lastIndex;
    }


    // -------------------------------
    // Utility Methods
    // -------------------------------

    public int size() 
    {
        return size;
    }

    public boolean isEmpty() 
    {
        return size == 0;
    }

    public void clear() 
    {
        head = null;
        size = 0;
    }

    // Print List (helper method)
    public void printList() //list console la print apnn
    {
        Node temp = head; // head ha temp la pothu
        while (temp != null) // temp null gatha varaikum tha loop podgum
        {
            System.out.print(temp.data + " -> "); //temp la irukura data va print pannum
            temp = temp.next; //print apnn aprm temp ku next irukura data va print apnnym so temp ipo temp.next ha marum
        }
        System.out.println("null");
    }
}


// ===========================================
// Test the LinkedList in main()
// ===========================================

public class LL1_LinkedListCustom {
    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        System.out.println("Adding elements...");
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();

        System.out.println("addFirst(5)");
        list.addFirst(5);
        list.printList();

        System.out.println("addLast(40)");
        list.addLast(40);
        list.printList();

        System.out.println("add at index 2 -> 15");
        list.add(2, 15);
        list.printList();

        System.out.println("get(2) = " + list.get(2));
        System.out.println("getFirst() = " + list.getFirst());
        System.out.println("getLast() = " + list.getLast());
        System.out.println("peek() = " + list.peek());

        System.out.println("set(1, 99)");
        list.set(1, 99);
        list.printList();

        System.out.println("remove() => " + list.remove());
        list.printList();

        System.out.println("remove index 2 => " + list.remove(2));
        list.printList();

        System.out.println("remove object 30 => " + list.removeObject(30));
        list.printList();

        System.out.println("contains(20) => " + list.contains(20));
        System.out.println("indexOf(20) => " + list.indexOf(20));
        System.out.println("lastIndexOf(20) => " + list.lastIndexOf(20));

        System.out.println("size() => " + list.size());
        System.out.println("isEmpty() => " + list.isEmpty());

        System.out.println("clear()");
        list.clear();
        list.printList();
        System.out.println("isEmpty() => " + list.isEmpty());
    }
}  