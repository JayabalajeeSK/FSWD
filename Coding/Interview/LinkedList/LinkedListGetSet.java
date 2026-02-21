package LinkedList;


public class LinkedListGetSet {
    public ListNode head;

    public LinkedListGetSet(ListNode head) {
        this.head = head;
    }

    // get by index
    public int get(int index) {
        ListNode temp = head;
        for(int i=0; i<index; i++) {
            if(temp == null) throw new IndexOutOfBoundsException();
            temp = temp.next;
        }
        if(temp == null) throw new IndexOutOfBoundsException();
        return temp.val;
    }

    // get first
    public int getFirst() {
        if(head == null) throw new IndexOutOfBoundsException();
        return head.val;
    }

    // get last
    public int getLast() {
        if(head == null) throw new IndexOutOfBoundsException();
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;
        return temp.val;
    }

    // set value at index
    public void set(int index, int val) {
        ListNode temp = head;
        for(int i=0; i<index; i++) {
            if(temp == null) throw new IndexOutOfBoundsException();
            temp = temp.next;
        }
        if(temp == null) throw new IndexOutOfBoundsException();
        temp.val = val;
    }
}

