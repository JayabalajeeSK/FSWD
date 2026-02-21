package BinarySearchTree;


public class BinarySearchTreeMain {

    public static void main(String[] args) {

        TreeNode root = null;

        // =========================
        // INSERT (BST)
        // =========================
        Integer[] values = {50, 30, 70, 20, 40, 60, 80};

        // for (int val : values) {
        //     root = TreeNode.addAtLast(root, val);
        // }

        root = TreeNode.buildTree(values);

        System.out.print("Inorder (Sorted BST): ");
        TreeNode.inorder(root);
        System.out.println();

        // =========================
        // SEARCH
        // =========================
        System.out.println("Search 40: " + TreeNode.search(root, 40));
        System.out.println("Search 100: " + TreeNode.search(root, 100));

        // =========================
        // FIND MIN & MAX
        // =========================
        System.out.println("Min value: " + TreeNode.findMin(root));
        System.out.println("Max value: " + TreeNode.findMax(root));

        // =========================
        // DELETE
        // =========================
        root = TreeNode.delete(root, 20); // leaf
        System.out.print("After deleting 20: ");
        TreeNode.inorder(root);
        System.out.println();

        root = TreeNode.delete(root, 30); // one child
        System.out.print("After deleting 30: ");
        TreeNode.inorder(root);
        System.out.println();

        root = TreeNode.delete(root, 50); // two children
        System.out.print("After deleting 50: ");
        TreeNode.inorder(root);
        System.out.println();

        // =========================
        // DELETE MIN & MAX
        // =========================
        root = TreeNode.deleteMin(root);
        System.out.print("After deleteMin: ");
        TreeNode.inorder(root);
        System.out.println();

        root = TreeNode.deleteMax(root);
        System.out.print("After deleteMax: ");
        TreeNode.inorder(root);
        System.out.println();

        // =========================
        // BFS (Level Order)
        // =========================
        System.out.print("BFS Traversal: ");
        TreeNode.bfs(root);
        System.out.println();

        // =========================
        // PREORDER & POSTORDER
        // =========================
        System.out.print("Preorder: ");
        TreeNode.preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        TreeNode.postorder(root);
        System.out.println();
    }
}

// Inorder (Sorted BST): 20 30 40 50 60 70 80 
// Search 40: true
// Search 100: false
// Min value: 20
// Max value: 80
// After deleting 20: 30 40 50 60 70 80 
// After deleting 30: 40 50 60 70 80 
// After deleting 50: 40 60 70 80
// After deleteMin: 60 70 80
// After deleteMax: 60 70
// BFS Traversal: 60 70
// Preorder: 60 70
// Postorder: 70 60