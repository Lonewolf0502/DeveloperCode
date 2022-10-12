// added a code of jump game with dp
// leatcode 55
class Solution {
    public boolean canJump(int[] jumps) {
        
        int reach=0;                        // time --> o(n)
        for(int i=0;i<jumps.length;i++){    // space --> o(1)
            if(i>reach) return false;
            
            if(i+jumps[i]>reach)
            {
                reach=i+jumps[i];
            }
        }
        
        return true;
    }
}