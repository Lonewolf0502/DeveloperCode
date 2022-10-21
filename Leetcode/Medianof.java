class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = a+b;
        int[] c1 = new int[c];
        System.arraycopy(nums1,0,c1,0,a);
        System.arraycopy(nums2,0,c1,a,b);
        Arrays.toString(c1);
        Arrays.sort(c1);
        
       if ( (c & 1) == 1 )
            return (double) c1[c>>1];
        else {
            return (c1[(c>>1) - 1] / 2.0) + (c1[c>>1] / 2.0);
        }
        
       // return c;
    }
}
