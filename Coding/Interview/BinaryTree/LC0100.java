

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Integer[] arr1 = {1, null, 2, 3};
        TreeNode root1 = TreeNode.buildTree(arr1);

        Integer[] arr2 = {1, null, 2, 3};
        TreeNode root2 = TreeNode.buildTree(arr2);

        boolean result = obj.isSameTree(root1, root2);
        System.out.println("Are both trees same? " + result);
    }
}