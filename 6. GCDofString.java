/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
*/


/*
Iski approch bs itni si h ki agar strings kuch common share krte h to vo dono kisina kisi point pr equal honge // Base case

case 1 : str1 = "AB" str2 = "ABC" 
    As in yaha koi nhi h gcd to first condition se blank string return hoga
    
case 2: str1 = "CBC"  str2 = "CBC"
      Qki dono strings same h to dono m koi bhi gcd ke equal hoga
      
 case 3: str1 = "ABABABAB" str2 = "AB"
        
        hum kya kr rehe h ki str1-str2 krte jaa rhe h through  this stmt gcdOfStrings(str1.substring(str2.length()), str2);
        ye isliye kr rhe h ki taki completly str1 traverse ho or ye pata laga sake ki str2 completely divide krta h ya nhi str1 ko

 case 4: str1 = "AB" str2 = "ABABABAB"
 
        jab str2.length() > str1.length() then swap them and follow case 3
        
        hum kya kr rehe h ki str1-str2 krte jaa rhe h through  this stmt gcdOfStrings(str1.substring(str2.length()), str2);
        ye isliye kr rhe h ki taki completly str1 traverse ho or ye pata laga sake ki str2 completely divide krta h ya nhi str1 ko    
    
*/
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if( !(str1+ str2).equals(str2+str1) )
            return  "";
        else if(str1.equals(str2))
        {
            return str1;
        }
        else if(str1.length() > str2.length())
        {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        else{
            return gcdOfStrings(str2.substring(str1.length()), str1);
        }
    }
}
