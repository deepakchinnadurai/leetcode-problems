// Given the root of a binary tree, return the inorder traversal of its nodes' values.
// Input: root = [1,null,2,3]
// Output: [1,3,2]



class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root != null){
            if(root.left != null){
                helper(root.left,res);
            }
            res.add(root.val);
            if(root.right != null){
                helper(root.right,res);
            }
        }
    }
}
