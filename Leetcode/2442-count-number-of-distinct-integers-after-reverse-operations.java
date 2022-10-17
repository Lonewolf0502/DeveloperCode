class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : nums)
        {
            hs.add(n);
            hs.add(reverse(n));
        }
        
        return hs.size();
        
    }
    
    public int reverse(int val)
    {
        int rev = 0;
        while(val > 0)
        {
            int ld = val % 10;
            rev = rev * 10 + ld;
            val = val/10;
        }
        return rev;
    }
}
