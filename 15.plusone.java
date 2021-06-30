// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.



class Solution {
    public int[] plusOne(int[] digits) {
       int i=digits.length-1;
    int carry=1;
    while(i>=0){
        
        int sum = digits[i] + carry;
        carry = sum/10;
        digits[i]=sum%10;
        i--;
        
    }
    
    int [] res = new int[digits.length+1];
    if(carry>0){
        res[0]=carry;
        for(i=0;i<digits.length;i++)
            res[i+1] = digits[i];
    }
    
    return (carry>0) ? res : digits;
    }
}
