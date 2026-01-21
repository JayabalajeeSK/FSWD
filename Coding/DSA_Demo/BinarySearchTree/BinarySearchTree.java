package DSA_Demo.BinarySearchTree;

import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree
{
    Node root;

    // ---------- INSERT ----------
    public void insert(int data)
    {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data)
    {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // ---------- INORDER ----------
    public void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // ---------- PREORDER ----------
    public void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // ---------- POSTORDER ----------
    public void postorder(Node root)
    {
        if (root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // ---------- LEVEL ORDER ----------
    public void levelOrder()
    {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
        System.out.println();
    }

    // ---------- SEARCH ----------
    public boolean search(int key)
    {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key)
    {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // ---------- MAIN ----------
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for(int val : values) bst.insert(val);

        System.out.print("Level Order: ");
        bst.levelOrder(); // 10 5 15 3 7 12 18

        System.out.print("Inorder: ");
        bst.inorder(bst.root); // 3 5 7 10 12 15 18
        System.out.println();

        System.out.print("Preorder: ");
        bst.preorder(bst.root); // 10 5 3 7 15 12 18
        System.out.println();

        System.out.print("Postorder: ");
        bst.postorder(bst.root); // 3 7 5 12 18 15 10
        System.out.println();

        System.out.println("Search 7: " + bst.search(7));   // true
        System.out.println("Search 20: " + bst.search(20)); // false
    }
}
// Level Order: 10 5 15 3 7 12 18 
// Inorder: 3 5 7 10 12 15 18 
// Preorder: 10 5 3 7 15 12 18 
// Postorder: 3 7 5 12 18 15 10 
// Search 7: true
// Search 20: false