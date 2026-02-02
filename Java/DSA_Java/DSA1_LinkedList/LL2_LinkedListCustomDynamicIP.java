package DSA_Java.DSA1_LinkedList;

import java.util.Scanner;

public class LL2_LinkedListCustomDynamicIP extends LL1_LinkedListCustom{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomLinkedList list = new CustomLinkedList();

        System.out.println("Enter elements of LinkedList (space separated, press Enter to end):");
        String line = sc.nextLine();
        String[] values = line.split(" ");

        for (String val : values) {
            if (!val.isEmpty()) {
                list.add(Integer.parseInt(val));
            }
        }

        System.out.println("LinkedList created:");
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

        sc.close();
    }
}