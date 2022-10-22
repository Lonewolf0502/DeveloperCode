class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          if(nums1.length > nums2.length)
              return findMedianSortedArrays(nums2,nums1);
        
        int x = nums1.length;
        int y = nums2.length;
        int low = 0;
        int high = x;
        
        while(low<=high){
            int partX =  (low+high)/2;
            int partY =  (x+y+1)/2 - partX;//x+y+1 (+1 is to handle odd length )
            int xLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX-1];
            int xRight = partX == x ? Integer.MAX_VALUE : nums1[partX];
            int yLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partY-1];
            int yRight = partY == y ? Integer.MAX_VALUE : nums2[partY];
            
            if(xLeft<=yRight && yLeft<=xRight){
               if((x+y)%2==0){
                   return ((double)Math.max(xLeft,yLeft) + Math.min(xRight,yRight))/2;
               }else{
                   return Math.max(xLeft,yLeft);
               } 
            }else if(xLeft>yRight){
                high = partX -1;
            }else{
                low = partX+1;
            }
        }
        return 0;
    }
}
