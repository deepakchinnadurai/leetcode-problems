// Given an integer array nums, 
// find the contiguous subarray (containing at least one number) 
//   which has the largest sum and return its sum.

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.


class Solution {
    public int maxSubArray(int[] nums) {
       int sum,prev=nums[0],maxsum,re=nums[0];
       for(int i=1;i<nums.length;i++){
           sum=prev+nums[i];
           maxsum=Math.max(nums[i],sum);
           re=Math.max(re,maxsum);
           prev=maxsum;
            
        }
        return re;
    }
}
