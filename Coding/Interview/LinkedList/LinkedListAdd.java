package LinkedList;

public class LinkedListAdd {
    public ListNode head;

    public LinkedListAdd() {
        this.head = null;
    }

    // add at end
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // add at index
    public void add(int index, int val) {
        if(index < 0) throw new IndexOutOfBoundsException();
        ListNode newNode = new ListNode(val);
        if(index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode temp = head;
        for(int i=0; i<index-1; i++) {
            if(temp == null) throw new IndexOutOfBoundsException();
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // addFirst
    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int val) {
        add(val);
    }
}
