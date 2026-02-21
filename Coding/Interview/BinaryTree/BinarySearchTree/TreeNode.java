package BinarySearchTree;

import java.util.*;

class TreeNode {

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

    // ==================================================
    // BUILD TREE
    // ==================================================
    // ❌ NOT USED IN BST INTERVIEWS (Level-order build is BT concept)
    // BST is built using INSERT logic
    // Kept only for compatibility
    public static TreeNode buildTree(Integer[] arr) {
        TreeNode root = null;
        for (Integer val : arr) {
            if (val != null)
                root = addAtLast(root, val); // BST insert
        }
        return root;
    }

    // ==================================================
    // ADD / INSERT
    // ==================================================

    // ❌ addAtRoot (BT concept)
    // ✅ CHANGED: In BST, root position depends on value
    public static TreeNode addAtRoot(TreeNode root, int val) {
        return addAtLast(root, val); // Redirect to BST insert
    }

    // ❌ addAtPosition (BT only)
    // ⚠️ NOT APPLICABLE FOR BST (position-based insert breaks BST property)

    // ✅ SAME METHOD NAME
    // 🔄 LOGIC CHANGED (BST INSERT)
    public static TreeNode addAtLast(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val)
            root.left = addAtLast(root.left, val);
        else if (val > root.val)
            root.right = addAtLast(root.right, val);

        return root;
    }

    // ==================================================
    // DELETE
    // ==================================================

    // ❌ deleteLast (BT concept)
    // ⚠️ NOT USED IN BST

    // ✅ SAME METHOD NAME
    // 🔄 LOGIC CHANGED (BST DELETE)
    public static TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val)
            root.left = delete(root.left, key);
        else if (key > root.val)
            root.right = delete(root.right, key);
        else {
            // Node found
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Two children → replace with inorder successor
            int min = findMin(root.right);
            root.val = min;
            root.right = delete(root.right, min);
        }
        return root;
    }

    // ==================================================
    // FIND MIN / MAX
    // ==================================================

    // 🔄 CHANGED
    // BST MIN = leftmost node
    public static int findMin(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        while (root.left != null)
            root = root.left;
        return root.val;
    }

    // 🔄 CHANGED
    // BST MAX = rightmost node
    public static int findMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        while (root.right != null)
            root = root.right;
        return root.val;
    }

    // ✅ SAME METHOD NAME
    // 🔄 LOGIC CHANGED (BST)
    public static TreeNode deleteMin(TreeNode root) {
        return delete(root, findMin(root));
    }

    // ✅ SAME METHOD NAME
    // 🔄 LOGIC CHANGED (BST)
    public static TreeNode deleteMax(TreeNode root) {
        return delete(root, findMax(root));
    }

    // ==================================================
    // SEARCH
    // ==================================================
    // ⭐ VERY IMPORTANT FOR INTERVIEWS
    public static boolean search(TreeNode root, int key) {
        if (root == null) return false;
        if (root.val == key) return true;
        return key < root.val
                ? search(root.left, key)
                : search(root.right, key);
    }

    // ==================================================
    // TRAVERSALS
    // ==================================================
    // ✅ SAME AS BT (NO CHANGE)

    public static void bfs(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    // ⭐ Inorder of BST = SORTED ORDER (INTERVIEW FAVORITE)

    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
