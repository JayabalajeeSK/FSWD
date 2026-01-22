package Interview.LinkedList;

public class LC0021 {
    // Recursive method to merge two sorted lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if (l1 == null) return l2; // if l1 is empty
        if (l2 == null) return l1; // if l2 is empty

        if (l1.val < l2.val) 
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } 
        else 
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) 
    {
        while (head != null) 
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the merge
    public static void main(String[] args) 
    {
        LC0021 sol = new LC0021();

        // Create first list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Create second list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        // Merge the two lists
        ListNode merged = sol.mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}