class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(nums.length);
        for (int i=1;i<nums.length+1;i++) {
            ans.add(i);
        }
        for (int n:nums) {
            ans.remove(new Integer(n));
        }
        return ans;
    }
}
