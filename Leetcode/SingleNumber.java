class Solution {
    public int singleNumber(int[] nums) {
        int no = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            no = no ^ nums[i];
        }
        return no;
    }
}
