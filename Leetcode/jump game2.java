  // Solution of jump game2 leetcode
  public static long memo(int src,int []nums,long[] dp)
     {
         if(src==nums.length-1) return 0;;
         if(dp[src]!=-1) return dp[src];
          long min=Integer.MAX_VALUE;
         for(int jump=1;jump<=nums[src];jump++)
        {
             if(src+jump <nums.length)
             {
                 min=Math.min(min,memo(src+jump,nums,dp)+1);
             }
         }
         
          dp[src]=min;
        
         return min;         
     }       
    
 }
