// Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

// A word is a maximal substring consisting of non-space characters only.


class Solution {
    public int lengthOfLastWord(String s) {
        int ans =0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            ans++;
        }
        return ans;
    }
}
