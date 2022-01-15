/*
Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

Example 1:

Input : 
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.
 

Example 2:

Input:
n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output:
16
*/



/*

Approch kuch u h ki..... qki sare contiguous subarrays having product< k nikalne h to sare contiguous subarray check krne h to sliding window kaam aayega.....
*/


class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int s =0 , e =0;
        long prod =1;
        int count =0;
        while(e < n)
        {
            prod = prod*a[e];
            while(prod >=k)
            {
                prod = prod/a[s];
                s++;
            }
            if(prod<k)
            {
                count = count +(e-s+1);
                e++;
            }
        } return count;
    }
}
