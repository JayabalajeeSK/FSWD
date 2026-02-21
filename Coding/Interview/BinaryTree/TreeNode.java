

import java.util.*;

class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }






    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }



    public static TreeNode addAtRoot(TreeNode root, int val) 
    {
        TreeNode newRoot = new TreeNode(val);
        newRoot.left = root;
        return newRoot;
    }

    public static void addAtPosition(TreeNode root, int pos, int val) 
    {
        if (pos == 0) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int index = 1;
        while (!q.isEmpty()) 
        {
            TreeNode node = q.poll();

            if (index == pos) 
            {
                node.left = new TreeNode(val);
                return;
            }
            index++;

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }

    public static void addAtLast(TreeNode root, int val) 
    {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) 
        {
            TreeNode current = queue.poll();

            if (current.left == null) 
            {
                current.left = new TreeNode(val);
                return;
            } 
            else 
            {
                queue.add(current.left);
            }

            if (current.right == null) 
            {
                current.right = new TreeNode(val);
                return;
            } 
            else 
            {
                queue.add(current.right);
            }
        }
    }

    public static void deleteLast(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode prev = null;
        TreeNode curr = null;

        while (!q.isEmpty()) 
        {
            prev = curr;
            curr = q.poll();

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }

        if (prev != null) 
        {
            if (prev.right == curr) prev.right = null;
            else prev.left = null;
        }
    }


    public static void delete(TreeNode root, int key) //root.val
    {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode target = null;
        TreeNode last = null;

        while (!q.isEmpty()) 
        {
            last = q.poll();
            if (last.val == key) target = last;

            if (last.left != null) q.add(last.left);
            if (last.right != null) q.add(last.right);
        }

        if (target != null) 
        {
            target.val = last.val;
            deleteLast(root);
        }
    }




    public static void bfs(TreeNode root) 
    {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) 
        {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }

    public static void inorder(TreeNode root) 
    {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void preorder(TreeNode root) 
    {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(TreeNode root) 
    {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static int findMin(TreeNode root) 
    {
        if (root == null) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) 
        {
            TreeNode node = q.poll();
            min = Math.min(min, node.val);

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return min;
    }


    public static int findMax(TreeNode root) 
    {
        if (root == null) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) 
        {
            TreeNode node = q.poll();
            max = Math.max(max, node.val);

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return max;
    }

    public static void deleteMin(TreeNode root) 
    {
        int min = findMin(root);
        delete(root, min);
    }

    public static void deleteMax(TreeNode root) 
    {
        int max = findMax(root);
        delete(root, max);
    }

}
    // Helper: build tree from level-order array (null for missing nodes)