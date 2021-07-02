// Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

// A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.


// Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: [0,-10,5,null,-3,null,9] is also accepted:





class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
          return construct(nums,0,nums.length-1);
       
    }
    private TreeNode construct(int nums[],int left,int right)
    {
        if(left>right)
            return null;
        int mid=(left+right)/2;
        TreeNode tree=new TreeNode();
        tree.val=nums[mid];
        tree.left=construct(nums,left,mid-1);
        tree.right=construct(nums,mid+1,right);
        return tree;
    }   
     
}
