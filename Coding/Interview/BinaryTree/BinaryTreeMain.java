

public class BinaryTreeMain {

    public static void main(String[] args) {

        // 1️⃣ Build Tree (LeetCode style)
        Integer[] arr = {1, 2, 3, 4, 5, null, 6};
        TreeNode root = TreeNode.buildTree(arr);

        System.out.println("BFS (Level Order):");
        TreeNode.bfs(root);
        System.out.println();

        System.out.println("Inorder:");
        TreeNode.inorder(root);
        System.out.println();

        System.out.println("Preorder:");
        TreeNode.preorder(root);
        System.out.println();

        System.out.println("Postorder:");
        TreeNode.postorder(root);
        System.out.println();

        // 2️⃣ Add at Last
        System.out.println("\nAdd 7 at Last:");
        TreeNode.addAtLast(root, 7);
        TreeNode.bfs(root);
        System.out.println();

        // 3️⃣ Add at Root
        System.out.println("\nAdd 0 at Root:");
        root = TreeNode.addAtRoot(root, 0);
        TreeNode.bfs(root);
        System.out.println();

        // 4️⃣ Delete Last
        System.out.println("\nDelete Last:");
        TreeNode.deleteLast(root);
        TreeNode.bfs(root);
        System.out.println();

        // 5️⃣ Delete by Value
        System.out.println("\nDelete node with value 3:");
        TreeNode.delete(root, 3);
        TreeNode.bfs(root);
        System.out.println();

        System.out.println("Min value: " + TreeNode.findMin(root));
        System.out.println("Max value: " + TreeNode.findMax(root));

        TreeNode.deleteMin(root);
        System.out.print("After deleting Min: ");
        TreeNode.bfs(root);
        System.out.println();

        TreeNode.deleteMax(root);
        System.out.print("After deleting Max: ");
        TreeNode.bfs(root);
        System.out.println();
    }
}
// BFS (Level Order):
// 1 2 3 4 5 6 
// Inorder:
// 4 2 5 1 3 6 
// Preorder:
// 1 2 4 5 3 6 
// Postorder:
// 4 5 2 6 3 1

// Add 7 at Last:
// 1 2 3 4 5 7 6

// Add 0 at Root:
// 0 1 2 3 4 5 7 6

// Delete Last:
// 0 1 2 3 4 5 7 6

// Delete node with value 3:
// 0 1 2 6 4 5 7 6
// PS E:\FSWD\Coding\Interview>  e:; cd 'e:\FSWD\Coding\Interview'; & 'C:\Program Files\Java\jdk-25.0.2\bin\java.exe' '-agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:50858' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\tharu\AppData\Roaming\Code\User\workspaceStorage\de749256a608623a943b5773e32b2426\redhat.java\jdt_ws\Interview_974c6c37\bin' 'BinaryTreeMain' 
// BFS (Level Order):
// 1 2 3 4 5 6 
// Inorder:
// 4 2 5 1 3 6
// Preorder:
// 1 2 4 5 3 6 
// Postorder:
// 4 5 2 6 3 1

// Add 7 at Last:
// 1 2 3 4 5 7 6

// Add 0 at Root:
// 0 1 2 3 4 5 7 6

// Delete Last:
// 0 1 2 3 4 5 7 6

// Delete node with value 3:
// 0 1 2 6 4 5 7 6
// Min value: 0
// Max value: 7
// After deleting Min: 6 1 2 6 4 5 7 6
// After deleting Max: 6 1 2 6 4 5 6 6