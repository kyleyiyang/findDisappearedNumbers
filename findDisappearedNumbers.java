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

//Still slow
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(4);
        for (int i=1;i<nums.length+1;i++) {
            //ans.add(nums[i-1],new Integer(nums[i-1]));
            ans.add(i);
            if (!ans.contains(nums[i-1])) {
                //ans.add(nums[i-1],nums[i-1]);
            }
        }
        ans.removeIf(n -> (IntStream.of(nums).anyMatch(x -> x == n)));
        /*System.out.println(ans.size());
        for (int n:nums) {
            ans.set(n-1,n);
            //ans.remove(new Integer(n));
        }*/
        return ans;
    }
}
