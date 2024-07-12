package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        // get to the leaf node ? if(root.left == null && root.right == null)
        // find out if leaf is a left leaf
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    if(temp.left.left == null && temp.left.right == null) sum = sum + temp.left.val;
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
                size--;
            }
        }
        return sum;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        return sumOfLeftLeavesHelper(root,false);
    }

    private int sumOfLeftLeavesHelper(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        if(root.left==null && root.right==null && isLeft) return root.val;
        return sumOfLeftLeavesHelper(root.left, true) + sumOfLeftLeavesHelper(root.right, false);
    }
}
