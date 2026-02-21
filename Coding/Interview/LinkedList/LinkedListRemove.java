package LinkedList;

public class LinkedListRemove {
    public ListNode head;

    public LinkedListRemove(ListNode head) {
        this.head = head;
    }

    // remove first
    public void removeFirst() {
        if(head == null) return;
        head = head.next;
    }

    // remove last
    public void removeLast() {
        if(head == null) return;
        if(head.next == null) {
            head = null;
            return;
        }
        ListNode temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    // remove by index
    public void remove(int index) {
        if(head == null) return;
        if(index == 0) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        for(int i=0; i<index-1; i++) {
            if(temp.next == null) return;
            temp = temp.next;
        }
        if(temp.next != null) temp.next = temp.next.next;
    }

    // remove by value (first occurrence)
    public void removeByValue(int val) {
        if(head == null) return;
        if(head.val == val) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        while(temp.next != null && temp.next.val != val) temp = temp.next;
        if(temp.next != null) temp.next = temp.next.next;
    }
}
