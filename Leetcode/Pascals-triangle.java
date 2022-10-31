class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int i=1;
        ans.add(list);
        while(i<numRows){
            List<Integer> list2=new ArrayList<>();
            list2.add(1);
            for(int j=1; j<i; j++)
                list2.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            list2.add(1);
            ans.add(list2);
            i++;
        }
        return ans;
    }
}