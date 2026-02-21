package Hashing;

import java.util.*;

public class HashingMapSet {

    public static void main(String[] args) {

        System.out.println("===== HASHMAP METHODS =====");

        // Constructors
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(10);
        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);

        // put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // putIfAbsent()
        map.putIfAbsent(3, "React");  // will not replace
        map.putIfAbsent(4, "React");

        // get()
        System.out.println("get(1): " + map.get(1));

        // getOrDefault()
        System.out.println("getOrDefault(10): " + map.getOrDefault(10, "Not Found"));

        // containsKey()
        System.out.println("containsKey(2): " + map.containsKey(2));

        // containsValue()
        System.out.println("containsValue(Java): " + map.containsValue("Java"));

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("isEmpty: " + map.isEmpty());

        // replace()
        map.replace(1, "Core Java");
        map.replace(2, "Python", "Advanced Python");

        // compute()
        map.compute(1, (k, v) -> v + " Updated");

        // computeIfAbsent()
        map.computeIfAbsent(5, k -> "Spring");

        // computeIfPresent()
        map.computeIfPresent(4, (k, v) -> v + " Framework");

        // merge()
        map.merge(6, "Node", (oldVal, newVal) -> oldVal + "JS");

        // keySet()
        System.out.println("Keys:");
        for (Integer key : map.keySet()) 
        {
            System.out.println(key);
        }

        // values()
        System.out.println("Values:");
        for (String value : map.values()) 
        {
            System.out.println(value);
        }

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // forEach()
        System.out.println("Using forEach:");
        map.forEach((k, v) -> System.out.println(k + " = " + v));

        // remove()
        map.remove(3);
        map.remove(2, "WrongValue"); // will not remove

        // putAll()
        map2.putAll(map);

        // clear()
        map3.put(100, "Temp");
        map3.clear();

        System.out.println("Final Map: " + map);


        System.out.println("\n===== HASHSET METHODS =====");

        // Constructors
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>(10);
        HashSet<Integer> set3 = new HashSet<>(10, 0.75f);

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        // contains()
        System.out.println("Contains 20: " + set.contains(20));

        // size()
        System.out.println("Set Size: " + set.size());

        // isEmpty()
        System.out.println("isEmpty: " + set.isEmpty());

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }

        // forEach()
        System.out.println("Using forEach:");
        set.forEach(System.out::println);

        // addAll()
        set2.addAll(set);

        // remove()
        set.remove(20);

        // removeAll()
        set2.removeAll(set);

        // retainAll()
        set2.add(50);
        set2.addAll(set);
        set2.retainAll(set);

        // toArray()
        Object[] arr = set.toArray();
        System.out.println("Array from Set:");
        for (Object obj : arr) 
        {
            System.out.println(obj);
        }

        // clear()
        set3.add(999);
        set3.clear();

        System.out.println("Final Set: " + set);
    }
}
// ===== HASHMAP METHODS =====
// get(1): Java
// getOrDefault(10): Not Found
// containsKey(2): true
// containsValue(Java): true
// Size: 4
// isEmpty: false
// Keys:
// 1
// 2
// 3
// 4
// 5
// 6
// Values:
// Core Java Updated
// Advanced Python
// C++
// React Framework
// Spring
// Node
// Entries:
// 1 -> Core Java Updated
// 2 -> Advanced Python
// 3 -> C++
// 4 -> React Framework
// 5 -> Spring
// 6 -> Node
// Using forEach:
// 1 = Core Java Updated
// 2 = Advanced Python
// 3 = C++
// 4 = React Framework
// 5 = Spring
// 6 = Node
// Final Map: {1=Core Java Updated, 2=Advanced Python, 4=React Framework, 5=Spring, 6=Node}

// ===== HASHSET METHODS =====
// Contains 20: true
// Set Size: 3
// isEmpty: false
// Using Iterator:
// 20
// 10
// 30
// Using forEach:
// 20
// 10
// 30
// Array from Set:
// 10
// 30
// Final Set: [10, 30]