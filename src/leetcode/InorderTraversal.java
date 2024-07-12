package leetcode;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
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

        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(leetcode.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    static void  inorder(leetcode.TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
