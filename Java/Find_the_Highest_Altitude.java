// Question with Solution - 
// Leetcode - 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/


class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(0);
       int max = 0;
       for(int i=0;i<gain.length; i++){
           int element = list.get(i)+gain[i];
           list.add(element);
           if(element>max){
               max = element;
           }
       }
      return max; 
    }
}