/*https://leetcode.com/problems/minimum-window-substring/*/ */
class Solution {
    public String minWindow(String s, String t) {
        int[] map=new int[128];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map[ch]++;
        }
        int start=0,end=0,minLeft=0,mini=Integer.MAX_VALUE,counter=t.length();
        while(end<s.length()){
            char ch = s.charAt(end);
            if(map[ch]>0)
            counter--;
                map[ch]--;
            
            end++;
                while(counter==0){
                    if(mini>end-start){
                        mini=end-start;
                        minLeft=start;
                    }
                    char ch2 = s.charAt(start);
                    map[ch2]++;
                    if(map[ch2]>0) counter++;
                    start++;
                    
                }
            }
        return mini==Integer.MAX_VALUE?"":s.substring(minLeft,minLeft+mini);
     }
}