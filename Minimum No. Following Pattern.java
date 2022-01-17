/*
Given a pattern containing only I's and D's. I for increasing and D for decreasing.
Devise an algorithm to print the minimum number following that pattern.
Digits from 1-9 and digits can't repeat.


Example 1:

Input:
D
Output:
21
Explanation:
D is meant for decreasing,
So we choose the minimum number
among 21,31,54,87,etc.
 

Example 2:

Input:
IIDDD
Output:
126543
Explanation:
Above example is self- explanatory,
1 < 2 < 6 > 5 > 4 > 3
  I - I - D - D - D
 
*/


/*
Approch ke liye referred sumit sir tutorial ,..........
num=1, Stack<Integer> st,    
intution bs ye h ki  jab bhi 'D' encounter ho to just push num in stack and increment num by one 
and jab bhi 'I' encounter ho to push num in stack and increment num by one and append stack element while poping in result variable


*/



static String printMinNumberForPattern(String S){
        // code here
        String res = "";
        Stack<Integer> st = new Stack<>();
        int num =1;
        
        for(int i =0;i<S.length();i++)
        {
            char c = S.charAt(i);
            if(c == 'D')
            {
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                
                
                while(st.size() >0)
                {
                    res += st.pop();
                }
            }
        }
        st.push(num);
        while(st.size() >0)
        {
            res = res + st.pop();
        }
        return res;
    }
