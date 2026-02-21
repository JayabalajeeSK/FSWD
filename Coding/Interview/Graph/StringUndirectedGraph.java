package Graph;

import java.util.*;

public class StringUndirectedGraph {

    static class Graph {

        Map<String, List<String>> adj;

        Graph() 
        {
            adj = new HashMap<>();
        }

        // Add vertex automatically if not present
        void addVertex(String v) 
        {
            adj.putIfAbsent(v, new ArrayList<>());
        }

        // Add edge (Undirected: u ↔ v)
        void addEdge(String u, String v) 
        {

            addVertex(u);
            addVertex(v);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Print adjacency list
        void printGraph() 
        {
            for (String vertex : adj.keySet()) 
            {
                System.out.print(vertex + " -> ");
                for (String neighbor : adj.get(vertex)) 
                {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        // BFS Traversal
        void BFS(String start) 
        {

            Set<String> visited = new HashSet<>();
            Queue<String> q = new LinkedList<>();

            visited.add(start);
            q.add(start);

            while (!q.isEmpty()) 
            {
                String node = q.poll();
                System.out.print(node + " ");

                for (String neighbor : adj.get(node)) 
                {
                    if (!visited.contains(neighbor)) 
                    {
                        visited.add(neighbor);
                        q.add(neighbor);
                    }
                }
            }
        }

        // DFS Traversal
        void DFS(String start) 
        {
            Set<String> visited = new HashSet<>();
            dfsUtil(start, visited);
        }

        void dfsUtil(String node, Set<String> visited) 
        {

            visited.add(node);
            System.out.print(node + " ");

            for (String neighbor : adj.get(node)) 
            {
                if (!visited.contains(neighbor)) 
                {
                    dfsUtil(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // Graph g = new Graph();

        // System.out.print("Enter number of edges: ");
        // int n = sc.nextInt();
        // sc.nextLine();  // clear buffer

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Enter edge (u v): ");
        //     String u = sc.next();
        //     String v = sc.next();
        //     g.addEdge(u, v);
        // }

        Graph g = new Graph();

        // Static edges (Undirected)
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "E");

        System.out.println("Adjacency List:");
        g.printGraph();

        System.out.println("\nBFS:");
        g.BFS("A");

        System.out.println("\nDFS:");
        g.DFS("A");
    }
}
// Adjacency List:
// A -> B C 
// B -> A D 
// C -> A E
// D -> B
// E -> C

// BFS:
// A B C D E
// DFS:
// A B D C E