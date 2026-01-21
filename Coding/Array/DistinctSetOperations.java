package Array;

import java.util.*;

public class DistinctSetOperations 
{
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 2, 3, 4, 4, 7, 9};
        int[] b = {2, 4, 4, 5, 6, 10};

        // Convert arrays to sets (removes duplicates)
        Set<Integer> setA = new HashSet<>();
        for (int num : a) setA.add(num);

        Set<Integer> setB = new HashSet<>();
        for (int num : b) setB.add(num);


        Set<Integer> union = new HashSet<>(setA); 
        union.addAll(setB); 


        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);


        Set<Integer> difference = new HashSet<>(union);
        difference.removeAll(intersection);
  
        System.out.println(difference); //[1, 3, 5, 6, 7, 9, 10]
    }
}

