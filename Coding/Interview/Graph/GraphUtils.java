package Graph;

import java.util.*;

public class GraphUtils 
{

    static class Graph 
    {
        int V;
        List<List<Integer>> adj;
        boolean isDirected;

        Graph(int V, boolean isDirected) 
        {
            this.V = V;
            this.isDirected = isDirected;
            adj = new ArrayList<>();

            for(int i=0; i<V; i++) 
            {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) 
        {
            adj.get(u).add(v);

            if(!isDirected) 
            {
                adj.get(v).add(u);
            }
        }

        void printGraph()
        {
            for(int i=0; i<V; i++) 
            {
                System.out.print(i + " -> ");
                for(int neighbor : adj.get(i)) 
                {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        void BFS(int start) 
        {
            boolean visited[] = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            while(!q.isEmpty()) 
            {
                int node = q.poll();
                System.out.print(node + " ");

                for(int neighbor : adj.get(node)) 
                {
                    if(!visited[neighbor]) 
                    {
                        visited[neighbor] = true;
                        q.add(neighbor);
                    }
                }
            }
        }

        void DFS(int start) 
        {
            boolean visited[] = new boolean[V];
            dfsUtil(start, visited);
        }

        void dfsUtil(int node, boolean visited[]) 
        {
            visited[node] = true;
            System.out.print(node + " ");

            for(int neighbor : adj.get(node)) 
            {
                if(!visited[neighbor]) 
                {
                    dfsUtil(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int V = 5;//sc.nextInt();

        System.out.println("Is Directed? (true/false)");
        boolean isDirected = true;//sc.nextBoolean();

        Graph g = new Graph(V, isDirected);

        // System.out.println("Enter number of edges:");
        // int E = sc.nextInt();

        // for(int i=0; i<E; i++) 
        // {
        //     int u = sc.nextInt();
        //     int v = sc.nextInt();
        //     g.addEdge(u, v);
        // }
        // STEP 2: Static edges (Directed)
        g.addEdge(0, 1);  // 0 → 1
        g.addEdge(0, 2);  // 0 → 2
        g.addEdge(1, 3);  // 1 → 3
        g.addEdge(2, 4);  // 2 → 4
        g.addEdge(3, 4);  // 3 → 4
        g.printGraph();

        System.out.println("BFS:");
        g.BFS(0);

        System.out.println("\nDFS:");
        g.DFS(0);

        sc.close();
    }
}
// Enter number of vertices:
// Is Directed? (true/false)
// 0 -> 1 2 
// 1 -> 3 
// 2 -> 4
// 3 -> 4
// 4 ->
// BFS:
// 0 1 2 3 4
// DFS:
// 0 1 3 4 2