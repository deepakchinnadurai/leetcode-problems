
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.


// Input: nums = [1,3,5,6], target = 5
// Output: 2




class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans = i;
                break;
            }
            if(nums[i]>target && ans==0){
                ans = i;
                break;
            }
            if(i == nums.length-1 && nums[i] != target && ans==0){
                ans = i+1;
            }
        }
        return ans;
    }
}
