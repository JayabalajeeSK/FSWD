package Interview.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LC0094 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.val); //sys(root.val)
        inOrder(root.right, result);
    }

    public static void main(String[] args) 
    {
        LC0094 obj = new LC0094();

        // Build tree from level-order array: [1, null, 2, 3]
        Integer[] arr = {1, null, 2, 3};
        TreeNode root = TreeNode.buildTree(arr);

        List<Integer> inorder = obj.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + inorder);
        // Output: Inorder Traversal: [1, 3, 2]
    }
}
