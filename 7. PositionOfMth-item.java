/*
Find the position of M-th item 
Basic Accuracy: 36.73% Submissions: 3069 Points: 1
M items are to be delivered in a circle of size N. Find the position where the M-th item will be delivered if we start from a given position K. Note that items are distributed at adjacent positions starting from K.

 

Example 1:

Input:
N = 5, M = 2, K = 1
Output:
2
Explanation:
If we start from 1st position, the
2nd item will land at the 2nd position.
Example 2:

Input:
N = 5, M = 8, K = 2
Output:
4
Explanation:
If we start from 2nd position, the
8th item will land at the 4th position.
*/

static int findPosition(int N , int M , int K) {
        // code here
        
        /*
        suppose the items are distributed in straight line , so the position of 
        Mth item in straight line when items are distributed starting from position K 
        will be : (M+K-1) 
        -1 isliye qki Kth person ko bi to ek item milega na....::)):):))))
        
        
        Now put them back in circle , so relative positioning of these will be
        (M+K-1)% N where N is size of circle;
        */
        int res = (M+K-1)%N;
        if(res == 0)
            return N;
        return res;    
    }
