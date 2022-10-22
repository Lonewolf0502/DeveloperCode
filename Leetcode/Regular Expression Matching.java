class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        return f(0,0,s,p);
    }
    
    boolean f(int i, int j, String s, String p){
        if(j == p.length()) return i == s.length();
        
        if(dp[i][j]!=null) return dp[i][j];
        
        boolean match = i<s.length() && 
            (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');
        
        boolean ans = false;
        
        if(j+1 < p.length() && p.charAt(j+1)=='*')
            ans = (match && f(i+1,j,s,p)) || f(i,j+2,s,p);
        
        else
          ans = match && f(i+1,j+1,s,p);
        
        
        return dp[i][j] = ans;
    }
}
