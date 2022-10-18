# Given a non-negative integer x, compute and return the square root of x.
# Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

# Example 1:
# Input: x = 4
# Output: 2

# Example 2:
# Input: x = 8
# Output: 2
# Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        if x==0 or x==1:
            return x
        
        start = 1
        end = x
        
        while start <= end:
            mid = (start + end)//2
            
            mid_sq = mid*mid
            
            if mid_sq == x:
                return mid
            
            if mid_sq < x:
                start = mid+1
                ans = mid
            else : 
                    end = mid-1
                    
                    return ans