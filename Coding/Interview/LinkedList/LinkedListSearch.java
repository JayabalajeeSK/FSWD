package LinkedList;

public class LinkedListSearch {
    public ListNode head;

    public LinkedListSearch(ListNode head) {
        this.head = head;
    }

    // contains
    public boolean contains(int val) {
        ListNode temp = head;
        while(temp != null) {
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }

    // indexOf
    public int indexOf(int val) {
        ListNode temp = head;
        int index = 0;
        while(temp != null) {
            if(temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // size
    public int size() {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

