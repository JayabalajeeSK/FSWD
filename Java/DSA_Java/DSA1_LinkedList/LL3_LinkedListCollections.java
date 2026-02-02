package DSA_Java.DSA1_LinkedList;

import java.util.LinkedList;

public class LL3_LinkedListCollections {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add(E e) — Add at end
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // addFirst(E e)
        list.addFirst(5);
        System.out.println(list);

        // addLast(E e)
        list.addLast(40);
        System.out.println(list);

        // add(index, element)
        list.add(2, 15);
        System.out.println(list);

        // get(index)
        System.out.println("get(2) = " + list.get(2));

        // getFirst()
        System.out.println("getFirst() = " + list.getFirst());

        // getLast()
        System.out.println("getLast() = " + list.getLast());

        // peek() — returns head, null if empty
        System.out.println("peek() = " + list.peek());

        // set(index, element) — update value
        list.set(1, 99);
        System.out.println(list);

        // remove() — remove first
        System.out.println("remove() => " + list.remove());
        System.out.println(list);

        // remove(index)
        System.out.println("remove index 2 => " + list.remove(2));
        System.out.println(list);

        // remove(Object o)
        System.out.println("remove object 30 => " + list.remove((Integer) 30));
        System.out.println(list);

        // contains(object)
        System.out.println("contains(20) => " + list.contains(20));

        // indexOf(object)
        System.out.println("indexOf(20) => " + list.indexOf(20));

        // lastIndexOf(object)
        System.out.println("lastIndexOf(20) => " + list.lastIndexOf(20));

        // size()
        System.out.println("size() => " + list.size());

        // isEmpty()
        System.out.println("isEmpty() => " + list.isEmpty());

        // clear()
        list.clear();
        System.out.println(list);
        System.out.println("isEmpty() => " + list.isEmpty());
    }
}