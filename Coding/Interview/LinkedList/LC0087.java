package Interview.LinkedList;

public class LC0087 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        if (head == null) return null;

        ListNode current = head;

        while (current != null && current.next != null) 
        {
            if (current.val == current.next.val) 
            {
                // Skip the duplicate
                current.next = current.next.next;
            } 
            else 
            {
                // Move forward
                current = current.next;
            }
        }

        return head; // return the start of the list
    }

    // main method to test
    public static void main(String[] args) {
        // Create linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode n5 = new ListNode(3);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode n1 = new ListNode(1, n2);

        LC0087 obj = new LC0087();
        ListNode result = obj.deleteDuplicates(n1);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 1 2 3
    }
}