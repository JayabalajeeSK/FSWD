package DSA_Java.Problems.Leetcode;

import java.util.*;

public class LL1_LinkedListLCEasy {

    // Custom Node class
    static class Node 
    {
        int data;
        Node next;
        Node(int data) 
        { 
            this.data = data; 
            this.next = null; 
        }
    }

    // -------------------------------
    // Problem 21: Merge Two Sorted Lists
    // -------------------------------
    static Node mergeTwoLists_LC21(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // -------------------------------
    // Problem 83: Remove Duplicates from Sorted List
    // -------------------------------
    static Node deleteDuplicates_LC83(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // -------------------------------
    // Problem 141: Linked List Cycle
    // -------------------------------
    static boolean hasCycle_LC141(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // -------------------------------
    // Problem 203: Remove Linked List Elements
    // -------------------------------
    static Node removeElements_LC203(Node head, int val) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        while (current.next != null) {
            if (current.next.data == val) current.next = current.next.next;
            else current = current.next;
        }
        return dummy.next;
    }

    // -------------------------------
    // Problem 206: Reverse Linked List
    // -------------------------------
    static Node reverseList_LC206(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    // -------------------------------
    // Problem 234: Palindrome Linked List
    // -------------------------------
    static boolean isPalindrome_LC234(Node head) {
        if (head == null || head.next == null) return true;
        // Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse second half
        Node second = reverseList_LC206(slow.next);
        Node first = head;
        while (second != null) {
            if (first.data != second.data) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    // -------------------------------
    // Problem 705: Design HashSet
    // -------------------------------
    static class MyHashSet_LC705 {
        boolean[] set;
        public MyHashSet_LC705() { set = new boolean[1000001]; }
        public void add(int key) { set[key] = true; }
        public void remove(int key) { set[key] = false; }
        public boolean contains(int key) { return set[key]; }
    }

    // -------------------------------
    // Problem 706: Design HashMap
    // -------------------------------
    static class MyHashMap_LC706 {
        int[] map;
        public MyHashMap_LC706() { map = new int[1000001]; Arrays.fill(map, -1); }
        public void put(int key, int value) { map[key] = value; }
        public int get(int key) { return map[key]; }
        public void remove(int key) { map[key] = -1; }
    }

    // -------------------------------
    // Problem 876: Middle of the Linked List
    // -------------------------------
    static Node middleNode_LC876(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // -------------------------------
    // Problem 1290: Convert Binary Number in a Linked List to Integer
    // -------------------------------
    static int getDecimalValue_LC1290(Node head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.data;
            head = head.next;
        }
        return num;
    }

    // -------------------------------
    // Random Problem 1: Swap Two Nodes (by values)
    // -------------------------------
    static Node swapNodes_R1(Node head, int val1, int val2) {
        if (val1 == val2) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev1 = dummy, prev2 = dummy, node1 = null, node2 = null;
        Node current = dummy;
        while (current.next != null) {
            if (current.next.data == val1) prev1 = current;
            if (current.next.data == val2) prev2 = current;
            current = current.next;
        }
        node1 = prev1.next; node2 = prev2.next;
        if (node1 == null || node2 == null) return head;
        if (prev1.next == prev2) { // adjacent nodes
            prev1.next = node2; node1.next = node2.next; node2.next = node1;
        } else if (prev2.next == prev1) { // adjacent other way
            prev2.next = node1; node2.next = node1.next; node1.next = node2;
        } else { // non-adjacent
            Node temp = node2.next;
            prev1.next = node2; node2.next = node1.next;
            prev2.next = node1; node1.next = temp;
        }
        return dummy.next;
    }

    // -------------------------------
    // Random Problem 2: Split Linked List into Two Halves
    // -------------------------------
    static Node[] splitList_R2(Node head) {
        if (head == null) return new Node[]{null, null};
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null;
        return new Node[]{head, slow};
    }

    // -------------------------------
    // Utility: Create Linked List from array
    // -------------------------------
    static Node createLinkedList(int[] arr) {
        Node dummy = new Node(0);
        Node current = dummy;
        for (int val : arr) {
            current.next = new Node(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Utility: Print Linked List
    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter problem number to run (21,83,141,203,206,234,705,706,876,1290,R1,R2):");
        String prob = sc.next();

        switch(prob) {
            case "21":
                Node l1 = createLinkedList(new int[]{1,2,4});
                Node l2 = createLinkedList(new int[]{1,3,4});
                Node merged = mergeTwoLists_LC21(l1,l2);
                printLinkedList(merged);
                break;
            case "83":
                Node dup = createLinkedList(new int[]{1,1,2,3,3});
                Node noDup = deleteDuplicates_LC83(dup);
                printLinkedList(noDup);
                break;
            case "141":
                Node cycle = createLinkedList(new int[]{3,2,0,-4});
                // create cycle manually
                cycle.next.next.next.next = cycle.next; 
                System.out.println(hasCycle_LC141(cycle));
                break;
            case "203":
                Node remove = createLinkedList(new int[]{1,2,6,3,4,5,6});
                Node afterRemove = removeElements_LC203(remove,6);
                printLinkedList(afterRemove);
                break;
            case "206":
                Node rev = createLinkedList(new int[]{1,2,3,4,5});
                Node reversed = reverseList_LC206(rev);
                printLinkedList(reversed);
                break;
            case "234":
                Node pal = createLinkedList(new int[]{1,2,2,1});
                System.out.println(isPalindrome_LC234(pal));
                break;
            case "705":
                MyHashSet_LC705 set = new MyHashSet_LC705();
                set.add(1); set.add(2);
                System.out.println(set.contains(1)); // true
                set.remove(1);
                System.out.println(set.contains(1)); // false
                break;
            case "706":
                MyHashMap_LC706 map = new MyHashMap_LC706();
                map.put(1,1); map.put(2,2);
                System.out.println(map.get(1)); // 1
                map.put(2,1);
                System.out.println(map.get(2)); // 1
                map.remove(2);
                System.out.println(map.get(2)); // -1
                break;
            case "876":
                Node mid = createLinkedList(new int[]{1,2,3,4,5});
                Node middle = middleNode_LC876(mid);
                printLinkedList(middle);
                break;
            case "1290":
                Node bin = createLinkedList(new int[]{1,0,1});
                System.out.println(getDecimalValue_LC1290(bin));
                break;
            case "R1":
                Node swap = createLinkedList(new int[]{1,2,3,4,5});
                Node swapped = swapNodes_R1(swap,2,4);
                printLinkedList(swapped);
                break;
            case "R2":
                Node split = createLinkedList(new int[]{1,2,3,4,5,6});
                Node[] halves = splitList_R2(split);
                System.out.print("First Half: ");
                printLinkedList(halves[0]);
                System.out.print("Second Half: ");
                printLinkedList(halves[1]);
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}