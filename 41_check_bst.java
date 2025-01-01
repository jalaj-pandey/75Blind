class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return bst(root,min,max);
    }
    public static boolean bst(Node node, int min, int max){
        if(node == null) return true;
        if(node.data <= min || node.data >= max) return false;
        return bst(node.left, min, node.data) && bst(node.right, node.data, max);
    }
}