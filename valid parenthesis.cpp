// 3.Valid parenthesis
// Input: s = "()"
// Output: true
  
 
  
class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for (int i = 0; i < s.length(); i++)
        {
            if (st.empty())
                st.push(s[i]);
            else 
            {
                bool cond1 = st.top() == '(' && s[i] == ')';
                bool cond2 = st.top() == '{' && s[i] == '}';
                bool cond3 = st.top() == '[' && s[i] == ']';
 
                if (cond1 || cond2 || cond3)
                    st.pop();
                else 
                    st.push(s[i]);
            }
        }
        
        return st.empty();
    }
};
