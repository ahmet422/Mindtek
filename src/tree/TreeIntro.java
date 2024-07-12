package tree;

public class TreeIntro {
    public static void main(String[] args) {
        // Tree:
        // non linear data structure for hierarchical storage

        // Terminology:
        // Parent Node: predecessor of a node
        // Child Node: successor of a node
        // Root Node: the topmost node
        // Leaf Node: Nodes with no children
        // Sibling: children nodes of the same parent node
        // Level of node: count of edges from root to specific node
        // Subtree: node of the tree with its descendants
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(9);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n2.right = n4;
    }
}
