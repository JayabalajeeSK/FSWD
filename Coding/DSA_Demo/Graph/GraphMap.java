package DSA_Demo.Graph;

import java.util.*;

public class GraphMap {
    private Map<Integer, List<Integer>> adjList; // adjacency list
    private boolean isDirected; // true = directed, false = undirected

    // ---------- CONSTRUCTOR ----------
    public GraphMap(boolean isDirected) {
        this.isDirected = isDirected;
        adjList = new HashMap<>();
    }

    // ---------- ADD VERTEX ----------
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // ---------- ADD EDGE ----------
    public void addEdge(int src, int dest) {
        addVertex(src);
        addVertex(dest);
        adjList.get(src).add(dest);

        if (!isDirected) { // add reverse edge for undirected graph
            adjList.get(dest).add(src);
        }
    }

    // ---------- PRINT GRAPH ----------
    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.print(v + " -> ");
            for (int neighbor : adjList.get(v)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // ---------- BFS ----------
    public void BFS(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // ---------- DFS ----------
    public void DFS(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        DFSUtil(start, visited);
        System.out.println();
    }

    private void DFSUtil(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        // Simulated input
        String input = "true\n7\n0 1\n0 2\n1 2\n2 0\n2 3\n3 3\n3 4\n2\n";
        Scanner sc = new Scanner(input);

        // Choose graph type
        System.out.print("Is the graph directed? (true/false): ");
        boolean directed = sc.nextBoolean();
        GraphMap g = new GraphMap(directed);

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(src, dest);
        }

        System.out.print("Enter starting vertex for BFS & DFS: ");
        int start = sc.nextInt();

        System.out.println("\nGraph Adjacency List:");
        g.printGraph();

        g.BFS(start);
        g.DFS(start);

        sc.close();
    }
}
// Is the graph directed? (true/false): Enter number of edges: Enter edges (source destination):
// Enter starting vertex for BFS & DFS:
// Graph Adjacency List:
// 0 -> 1 2
// 1 -> 2
// 2 -> 0 3
// 3 -> 3 4
// 4 ->
// BFS Traversal: 2 0 3 1 4
// DFS Traversal: 2 0 1 3 4