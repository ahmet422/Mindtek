package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    // Traversal:
    // 1 Depth first Search (DFS): preorder(curr-left-right), inorder(left,current,right), postorder(left,right,current)
    // 2 Breadth first search (BFS): level order from left to right
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(9);
        TreeNode n5 = new TreeNode(10);
        TreeNode n6 = new TreeNode(2);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n5;
        n2.right = n4;
        n2.left = n6;
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
        System.out.print("BFS:");
        levelOrderTraversal(root);
    }

    public static void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void levelOrderTraversal(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.val + " ");
            // push left and right children
            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
        }
    }
}
