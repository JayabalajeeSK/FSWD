package Graph;

import java.util.*;

public class StringDirectedGraph {

    static class Graph {

        // Adjacency List using Map
        Map<Character, List<Character>> adj;

        Graph() 
        {
            adj = new HashMap<>();
        }

        // Add vertex if not present
        void addVertex(char v) 
        {
            adj.putIfAbsent(v, new ArrayList<>());
        }

        // Add edge (Directed: u → v)
        void addEdge(char u, char v) 
        {
            addVertex(u);
            addVertex(v);
            adj.get(u).add(v);
        }

        // Print Graph
        void printGraph() 
        {
            for (char vertex : adj.keySet()) 
            {
                System.out.print(vertex + " -> ");
                for (char neighbor : adj.get(vertex)) 
                {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        // BFS
        void BFS(char start) 
        {
            Set<Character> visited = new HashSet<>();
            Queue<Character> q = new LinkedList<>();

            visited.add(start);
            q.add(start);

            while (!q.isEmpty()) 
            {
                char node = q.poll();
                System.out.print(node + " ");

                for (char neighbor : adj.get(node)) 
                {
                    if (!visited.contains(neighbor)) 
                    {
                        visited.add(neighbor);
                        q.add(neighbor);
                    }
                }
            }
        }

        // DFS
        void DFS(char start) 
        {
            Set<Character> visited = new HashSet<>();
            dfsUtil(start, visited);
        }

        void dfsUtil(char node, Set<Character> visited) 
        {
            visited.add(node);
            System.out.print(node + " ");

            for (char neighbor : adj.get(node)) 
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

        // System.out.println("Enter number of edges:");
        // int E = sc.nextInt();

        // System.out.println("Enter edges (u v):");
        // for (int i = 0; i < E; i++) {
        //     char u = sc.next().charAt(0);
        //     char v = sc.next().charAt(0);
        //     g.addEdge(u, v);
        // }

        Graph g = new Graph();

        // Static edges (Directed)
        g.addEdge('A', 'B');  // A → B
        g.addEdge('A', 'C');  // A → C
        g.addEdge('B', 'D');  // B → D
        g.addEdge('C', 'E');  // C → E
        g.addEdge('D', 'E');  // D → E

        System.out.println("Adjacency List:");
        g.printGraph();

        System.out.println("\nBFS from A:");
        g.BFS('A');

        System.out.println("\nDFS from A:");
        g.DFS('A');
    }
}
// Adjacency List:
// A -> B C 
// B -> D 
// C -> E
// D -> E
// E ->

// BFS from A:
// A B C D E
// DFS from A:
// A B D E C