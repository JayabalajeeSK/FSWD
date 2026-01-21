package Array;

import java.util.*;

public class LC0056_Merge_Intervals {
    public static int[][] merge(int[][] intervals) 
    {
        if (intervals == null || intervals.length == 0) return new int[0][0];

        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        LinkedList<int[]> result = new LinkedList<>();

        for (int[] interval : intervals) 
        {
            // If list is empty or current interval does not overlap with last, add it
            if (result.isEmpty() || interval[0] > result.getLast()[1]) 
            {
                result.add(interval);
            } 
            else 
            {
                // Overlapping intervals, merge by updating the end
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        // Example 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged1 = merge(intervals1);
        System.out.println("Example 1 Output: " + Arrays.deepToString(merged1));

        // Example 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] merged2 = merge(intervals2);
        System.out.println("Example 2 Output: " + Arrays.deepToString(merged2));

        // Example 3
        int[][] intervals3 = {{4, 7}, {1, 4}};
        int[][] merged3 = merge(intervals3);
        System.out.println("Example 3 Output: " + Arrays.deepToString(merged3));
    }
}
// Example 1 Output: [[1, 6], [8, 10], [15, 18]]
// Example 2 Output: [[1, 5]]
// Example 3 Output: [[1, 7]]