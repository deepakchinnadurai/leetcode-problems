

// Share
// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5


// Input: x = 4
// Output: 2




class Solution {
    public int mySqrt(int x) {
        double low =1;
        double high= x;
        double eps = 1e-6;
        while((high-low) > eps ){
            double mid = (low+high)/2.0;
            if(mid*mid<x){
                low=mid;
            }
            else
                high=mid;
                 
        }
        return (int)high;
    }
}





//another method


class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int left=0,right=x,mid=(right-left)/2;
        while(left<=right){
            if(mid == (x/mid)) return mid;
            else if(mid <(x/mid)) left = mid+1;
            else if(mid >(x/mid)) right  = mid -1;
            mid = left+(right-left)/2;
            
        }
        return right;
    }
}
