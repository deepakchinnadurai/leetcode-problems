// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"













class Solution {
    public String addBinary(String a, String b) {
        int i= a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder  sb = new StringBuilder("");
        while(i>=0 || j>=0){
            int x=0;
            int y=0 ;
            int sum=0;
            if(i>=0 ){
                x=a.charAt(i)-'0';
            }
            if(j>=0){
                y = b.charAt(j)-'0';
            }
           sum = x+y+carry;
           if(sum==3){
               sb.append(1);
               carry = 1;
           }
            else if(sum==2){
                sb.append(0);
                carry = 1;
            }
            else{
                sb.append(sum);
                carry = 0;
            }
            j--;
            i--;
        }
        if(carry ==1) sb.append(1);
        return sb.reverse().toString();
    }
}
