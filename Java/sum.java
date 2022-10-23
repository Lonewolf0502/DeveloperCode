 public int[] twoSum(int[] no, int target) {
       int length = no.length;
       for(int i=0;i<length;i++)
       {
           for(int j=i+1;j<length;j++)
           {
               if(no[i]+no[j] == target)
               {
                   return new int[]{i,j};  // If pair found then return in the form of array(eg.- [i,j]).
               }
           }
       }
      return new int[]{-1}; // if pair not found then return array([-1]).
   }
