package DSA_Demo.BinaryTree;

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

public class BinaryTree
{
    Node root;

    // ---------- CREATE TREE USING ARRAY ----------
    public void createFromArray(int[] arr)
    {
        if (arr.length == 0) return;

        Queue<Node> queue = new LinkedList<>();

        root = new Node(arr[0]);
        queue.add(root);

        int i = 1;

        while (i < arr.length)
        {
            Node current = queue.poll();

            // LEFT CHILD
            if (i < arr.length)
            {
                current.left = new Node(arr[i]);
                i++;
                queue.add(current.left);
            }

            // RIGHT CHILD
            if (i < arr.length)
            {
                current.right = new Node(arr[i]);
                i++;
                queue.add(current.right);
            }
        }
    }

    // ---------- LEVEL ORDER PRINT ----------
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
    // ---------- POSTORDER ----------
    public void postorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    // ---------- PREORDER ----------
    public void preorder(Node root)
    {
        if (root != null)
        {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        int[] values = {1, 2, 3, 4, 5, 6, 7};

        tree.createFromArray(values);

        System.out.print("Level Order: ");
        tree.levelOrder();

        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
    }
}
// Level Order: 1 2 3 4 5 6 7 

// Inorder: 4 2 5 1 6 3 7
// Preorder: 1 4 2 5 6 3 7
// Postorder: 4 2 5 6 3 7 1 