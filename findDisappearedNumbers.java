class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            int temp = nums[i];
            if (temp!=(i+1)) {
                //System.out.println("i="+i+"; temp="+temp);
                ans.add(i+1);
                int t = nums[temp-1];
                while (t!=temp ) {
                    //System.out.println("first i="+i+"; temp="+temp+"; t="+t);
                    nums[temp-1]=temp;
                    if(ans.contains(temp)) ans.remove(new Integer(temp));
                    temp=t;
                    t=nums[temp-1];
                    //System.out.println("2nd i="+i+"; temp="+temp+"; t="+t);
                }
            }
        }
        return ans;
    }
}
