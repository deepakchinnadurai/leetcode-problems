// Given the root of a binary tree and an integer targetSum, 
// return true if the tree has a root-to-leaf path such that
// adding up all the values along the path equals targetSum.

// A leaf is a node with no children.

// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true



class Solution {
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if (root==null) return false;
        DFS(root, targetSum, 0);
        return ans; 
    }
    public void DFS(TreeNode cur, int target, int curSum){
        if (cur==null) return;
        if (cur.left==null && cur.right==null && target==curSum+cur.val) {
            ans = true;
            return;
        }
        DFS(cur.left, target, curSum+cur.val);
        DFS(cur.right, target, curSum+cur.val);
    }
}
