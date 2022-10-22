//Problem Link:- https://leetcode.com/problems/jewels-and-stones/

//Problem Solution in Java:

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count = count+1;
                }
            }
        }
        return count;
    }
}