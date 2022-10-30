// problem from the leetcode

class Solution {
public:
    int xorAllNums(vector<int>& nums1, vector<int>& nums2) {
        int ans = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i = 0; i < n1; i++){
            if(n2&1)      // if n2 is odd enter the loop
            {
                ans = ans ^ nums1[i];
            }
        }
        for(int i = 0; i < n2; i++){
            if(n1&1)    // if n1 is odd enter the loop
            {
                ans = ans ^ nums2[i];
            }
        }
        return ans;
    }
};


/*
XOR of even times of a number is zero (0);
XOR of odd times of a number is number itself;
here,
n=nums1.size() and m=nums2.size();

case 1: when n and m is even
suppose nums1={a,b}, nums2={c,d}
taking xor => {a^c,a^d,b^c,b^d }
finally taking xor of all => {a^c^a^d^b^c^b^d} ------ (1)
we know that x^x=0(even times xor with self = 0)
Now, (1) becomes => {a^a^b^b^c^c^d^d} => {0^0^0^0} =0
RESULT(case 1) =0;

case 2 : when both are odd
Let's x1= xor of all elements of nums1, x2=xor of all elements of nums2
suppose nums1={a}, nums2={c} (you can deduce by yourself, I am taking the easier one , take nums1={a,b,c}, nums2={d,e,f} and solve it)
taking xor => {a^c}
RESULT (case 2) = (x1 ^x2)

Case 3/4: when one of them is odd and other is even
nums1={a,b,c}, nums2={d,e}
Here, all terms of nums1 comes even times(m times) in final xorr => so, we can take them as zero
And, all terms of nums2 comes odd times(n times) => so, we can take odd=(even+1) => 1 times x2
x1=a^b^c, x2=d^e

RESULT(CASE 3/4) = x2(if m is even) , = x1 (if n is even)

*/
