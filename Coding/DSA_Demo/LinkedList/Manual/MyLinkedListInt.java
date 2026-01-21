package DSA_Demo.LinkedList.Manual;

import java.util.NoSuchElementException;

class MyLinkedListInt
{
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedListInt() 
    {
        head = null;
        tail = null;
        size = 0;
    }
/****************************************************************************************************
 *                                                                                                  *
 *        AAAA          DDDD         DDDD                                                           *
 *       A    A         D   D       D   D                                                          *
 *      A      A        D   D       D   D                                                          *
 *     AAAAAAAAAA       D   D       D   D                                                          *
 *    A          A      D   D       D   D                                                          *
 *   A            A     D   D       D   D                                                          *
 *  A              A    DDDD         DDDD                                                          *
 *                                                                                                  *
 *                               A D D   M E T H O D S                                             *
 *                                                                                                  *
 ****************************************************************************************************/
    // ----- Add Methods -----
    public void add(int data) 
    { // addLast
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = tail = newNode;
        }
        else 
        {
            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;
        }
        size++;
    }

    public void addLast(int data)
    {
        add(data);
    }

    public void addFirst(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = tail = newNode;
        }
        else 
        {
            newNode.next = head;

            head.prev = newNode;

            head = newNode;
        }
        size++;
    }

    public void add(int index, int data) 
    {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) 
        { 
            addFirst(data); 
            return; 
        }
        if (index == size) { add(data); return; }

        Node newNode = new Node(data);

        Node current = head;

        for (int i = 0; i < index - 1; i++) 
        {
            current = current.next;
        }

        newNode.next = current.next;

        newNode.prev = current;

        current.next.prev = newNode;

        current.next = newNode;

        size++;
    }

    public void addAll(int[] arr)
    {
        for (int value : arr)
        {
            add(value);   // reuse addLast
        }
    }

    public void addAll(MyLinkedListInt other)
    {
        Node current = other.head;

        while (current != null)
        {
            add(current.data);
            current = current.next;
        }
    }


    public void addAll(int index, int[] arr)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        for (int value : arr)
        {
            add(index++, value);
        }
    }



    public void addAll(int index, MyLinkedListInt other)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node current = other.head;

        while (current != null)
        {
            add(index++, current.data);
            current = current.next;
        }
    }

/****************************************************************************************************
 *                                                                                                  *
 *   GGGGGG       EEEEEEEE       TTTTTTTTTT                                                         *
 *  G      G      E                 TT                                                              *
 * G               E                 TT                                                              *
 * G   GGGG       EEEEEEEE           TT                                                              *
 * G      G       E                   TT                                                              *
 *  GGGGGG        EEEEEEEE           TT                                                              *
 *                                                                                                  *
 *                               G E T   M E T H O D S                                             *
 *                                                                                                  *
 ****************************************************************************************************/

    // ----- Get Methods -----
    public int getFirst() 
    {
        if (head == null) throw new NoSuchElementException();

        return head.data;
    }

    public int getLast() 
    {
        if (tail == null) throw new NoSuchElementException();

        return tail.data;
    }

    public int get(int index) 
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node current = head;

        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }

        return current.data;
    }
/****************************************************************************************************
 *                                                                                                  *
 *  RRRRRR        EEEEEEEE      MMMMM    MMMMM      OOOOO       VVV       VVV       EEEEEEEE       *
 *  R     R       E            M    M  M    M    O     O       VVV     VVV        E              *
 *  RRRRRR        EEEEEEEE     M     MM     M   O       O       VVV   VVV         EEEEEEEE       *
 *  R   R         E            M           M    O       O        VVV VVV          E              *
 *  R    R        EEEEEEEE     M           M     OOOOOOO          VVV            EEEEEEEE       *
 *                                                                                                  *
 *                               R E M O V E   M E T H O D S                                       *
 *                                                                                                  *
 ****************************************************************************************************/
    // ----- Remove Methods -----
    public int removeFirst() 
    {
        if (head == null) throw new NoSuchElementException();

        int data = head.data;

        if (head == tail) 
        {
            head = tail = null;
        }
        else 
        {
            head = head.next;

            head.prev = null;
        }

        size--;

        return data;
    }

    public int removeLast() 
    {
        if (tail == null) throw new NoSuchElementException();

        int data = tail.data;

        if (head == tail) 
        {
            head = tail = null;
        }
        else 
        {
            tail = tail.prev;

            tail.next = null;
        }

        size--;

        return data;
    }

    public int remove(int index) 
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) return removeFirst();

        if (index == size - 1) return removeLast();

        Node current = head;

        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }

        current.prev.next = current.next;

        current.next.prev = current.prev;

        size--;

        return current.data;
    }

    public boolean removeValue(int data) 
    {
        Node current = head;
        while (current != null) 
        {
            if (current.data == data) 
            {
                if (current == head) removeFirst();

                else if (current == tail) removeLast();

                else 
                {
                    current.prev.next = current.next;

                    current.next.prev = current.prev;

                    size--;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeAll() 
    {
        Node current = head;

        while (current != null) 
        {
            Node nextNode = current.next;

            current.prev = null;

            current.next = null;

            current = nextNode;
        }

        head = null;
        tail = null;
        size = 0;
    }
/****************************************************************************************************
 *                                                                                                  *
 *  SSSSSSS       EEEEEEEE       TTTTTTTTTT          RRRRRR      EEEEEEEE       PPPPPPP      L      *
 *  S             E                 TT               R     R     E              P     P     L      *
 *   SSSSSS       EEEEEEEE           TT             RRRRRR      EEEEEEEE       PPPPPPP      L      *
 *        S       E                 TT               R   R      E              P            L      *
 *  SSSSSSS       EEEEEEEE           TT              R    R     EEEEEEEE       P            LLLLL  *
 *                                                                                                  *
 *                              S E T   /   R E P L A C E   M E T H O D S                          *
 *                                                                                                  *
 ****************************************************************************************************/
    // ----- Set/Replace -----
    public void set(int index, int data) 
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node current = head;

        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }

        current.data = data;
    }
    
/****************************************************************************************************
 *                                                                                                  *
 *  SSSSSSS       EEEEEEEE      AAAA       RRRRRR      CCCCC       HHH   HHH         IIIIII      *
 *  S             E            A    A      R     R    C           HHH   HHH           II        *
 *   SSSSSS       EEEEEEEE    AAAAAAA     RRRRRR     C           HHHHHHHHH           II        *
 *        S       E           A       A    R   R     C           HHH   HHH           II        *
 *  SSSSSSS       EEEEEEEE   A         A   R    R     CCCCC       HHH   HHH         IIIIII      *
 *                                                                                                  *
 *                             S E A R C H   /   I N D E X   M E T H O D S                         *
 *                                                                                                  *
 ****************************************************************************************************/

    // ----- Search -----
    public boolean contains(int data) 
    {
        Node current = head;
        while (current != null) 
        {
            if (current.data == data) 
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(int data) 
    {
        Node current = head;

        int index = 0;

        while (current != null) 
        {
            if (current.data == data) 
            {
                return index;
            }

            current = current.next;

            index++;
        }
        return -1;
    }

    public int lastIndexOf(int data) 
    {
        Node current = tail;

        int index = size - 1;

        while (current != null) 
        {
            if (current.data == data) return index;

            current = current.prev;

            index--;
        }
        return -1;
    }
/****************************************************************************************************
 *                                                                                                  *
 *   SSSSSSS       IIIIII      ZZZZZZZZZ       EEEEEEEE                                               *
 *  S               II             Z           E                                                         *
 *   SSSSSS         II           ZZZ           EEEEEEEE                                               *
 *        S         II          Z              E                                                         *
 *  SSSSSSS       IIIIII      ZZZZZZZZZ       EEEEEEEE                                               *
 *                                                                                                  *
 *                            S I Z E   /   I S E M P T Y   M E T H O D S                            *
 *                                                                                                  *
 ****************************************************************************************************/

    // ----- Size & Empty -----
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

/****************************************************************************************************
 *                                                                                                  *
 *  PPPPPPP       RRRRRR       IIIIII      N     N       TTTTTTTTTT                                   *
 *  P     P       R    R        II        NN    N           TT                                         *
 *  PPPPPPP       RRRRRR        II        N N   N           TT                                         *
 *  P             R   R         II        N  N  N           TT                                         *
 *  P             R    R      IIIIII      N    NN           TT                                         *
 *                                                                                                  *
 *                           P R I N T   /   I T E R A T I O N   M E T H O D S                       *
 *                                                                                                  *
 ****************************************************************************************************/

    // ----- Iteration -----
    public void printForward() 
    {
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() 
    {
        Node current = tail;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

/****************************************************************************************************
 *                                                                                                  *
 *  SSSSSSS       TTTTTTTTTT      AAAA       CCCCC       KKK   KKK         /         QQQQQ       U     U       EEEEEEEE      U     U       EEEEEEEE  *
 *  S               TT           A    A     C           K  K K           /         Q     Q      U     U       E             U     U       E          *
 *   SSSSSS         TT          AAAAAAA     C           KKKK             /         Q     Q      U     U       EEEEEEEE      U     U       EEEEEEEE   *
 *        S         TT         A       A    C           K  KK           /          Q   Q Q      U     U       E             U     U       E          *
 *  SSSSSSS         TT        A         A    CCCCC      K   KKK        /           QQQQQ Q       UUUUU        EEEEEEEE       UUUUU        EEEEEEEE  *
 *                                                                                                  *
 *                          S T A C K   /   Q U E U E   M E T H O D S                               *
 *                                                                                                  *
 ****************************************************************************************************/

    // ----- Stack/Queue methods -----
    public void push(int data) { addFirst(data); }

    public int pop() { return removeFirst(); }

    public int peek() { return getFirst(); }

    public void offer(int data) { add(data); }

    public void offerFirst(int data) { addFirst(data); }

    public void offerLast(int data) { add(data); }

    public int poll() { return removeFirst(); }

    public int pollFirst() { return removeFirst(); }
    
    public int pollLast() { return removeLast(); }
}