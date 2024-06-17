/*
633. Sum of Square Numbers
Solved
Medium
Topics
Companies
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
 

Constraints:

0 <= c <= 231 - 1
Seen this question in a real interview before?
1/5
Yes
No
Accepted
256.5K
Submissions
728.6K
Acceptance Rate
35.2%
Topics
Companies
Similar Questions
Discussion (111)

*/


class Solution {
    public boolean judgeSquareSum(int c) {
      /*  long i=0,j= Math.sqrt(c);
        while(i<=j){
            long sum=i*i+j*j;
            if(sum==c){
                return true;
            }else if(sum<c){
                i++;
            }else{
                j--;
            }

        }return false;*/
         for (int i = 2; i * i <= c; i++) {
            int count = 0;
            if (c % i == 0) {
                while (c % i == 0) {
                    count++;
                    c /= i;
                }
                if (i % 4 == 3 && count % 2 != 0)
                    return false;
            }
        }
        return c % 4 != 3;
        
    }
}
