package String;

import java.util.*;


public class GFG_Strings_Can_be_Chained_Or_Not 
{

    static boolean canFormCircle(String[] arr) 
    {
        int[] in = new int[26];
        int[] out = new int[26];
        boolean[] used = new boolean[26];

        // Build in/out degrees
        for (String s : arr) 
        {
            int first = s.charAt(0) - 'a';
            int last = s.charAt(s.length() - 1) - 'a';
            out[first]++;
            in[last]++;
            used[first] = true;
            used[last] = true;
        }

        // Check in-degree == out-degree
        for (int i = 0; i < 26; i++) 
        {
            if (in[i] != out[i]) return false;
        }

        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());
        for (String s : arr) 
        {
            int u = s.charAt(0) - 'a';
            int v = s.charAt(s.length() - 1) - 'a';
            adj.get(u).add(v);
        }

        // DFS
        boolean[] visited = new boolean[26];
        int start = -1;
        for (int i = 0; i < 26; i++) 
        {
            if (used[i]) 
            {
                start = i;
                break;
            }
        }

        dfs(adj, start, visited);

        for (int i = 0; i < 26; i++) 
        {
            if (used[i] && !visited[i]) return false;
        }

        return true;
    }

    static void dfs(List<List<Integer>> adj, int u, boolean[] visited) 
    {
        visited[u] = true;
        for (int v : adj.get(u)) 
        {
            if (!visited[v]) dfs(adj, v, visited);
        }
    }

    public static void main(String[] args) 
    {
        String[] arr1 = {"geek", "king"};
        String[] arr2 = {"aaa", "bbb", "baa", "aab"};
        String[] arr3 = {"aaa"};
        String[] arr4 = {"aaa", "bbb"};

        System.out.println(canFormCircle(arr1) ? "Yes" : "No"); // Yes
        System.out.println(canFormCircle(arr2) ? "Yes" : "No"); // Yes
        System.out.println(canFormCircle(arr3) ? "Yes" : "No"); // Yes
        System.out.println(canFormCircle(arr4) ? "Yes" : "No"); // No
    }
}
