// 1.Longest valid parenthesis
// Input: s = "(()"
// Output: 2
// Explanation: The longest valid parentheses substring is "()".

  
#include<iostream>
#include<stack>
#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    stack<int>st;
    int ans=0;
    st.push(-1);
    for(int i=0;i<s.length();i++){
        if(s[i]=='('){
            st.push(i);
        }
        else{
            st.pop();
            if(st.empty()){
                st.push(i);
            }
            else{
                ans = max(ans,i-st.top());
            }
        }
    }
    cout<<ans;
}
