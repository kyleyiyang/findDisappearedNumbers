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

//_____________________
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(4);
        //int total=nums.length*(nums.length+1)/2;
        //int sum=total;
       //int count=0;
        for (int i=1;i<=nums.length;i++) {
            int j=i;
            if (!IntStream.of(nums).anyMatch(x -> x == j)) {
                ans.add(i);
            }
        }
        /*for (int i=0;i<nums.length;i++) {
            //ans.add(nums[i-1],new Integer(nums[i-1]));
            //ans.add(i);
            if (!ans.contains(nums[i])) {
                ans.add(nums[i]);
                //ans.add(nums[i-1],nums[i-1]);
                sum-=nums[i];
            } else {
                count+=nums[i];
            }
        }*/
        //System.out.println("total="+total+"; sum="+sum+"; count="+count);
        //ans.removeIf(n -> (IntStream.of(nums).anyMatch(x -> x == n)));
        /*System.out.println(ans.size());
        for (int n:nums) {
            ans.set(n-1,n);
            //ans.remove(new Integer(n));
        }*/
        return ans;
    }
}
*************************************************************************************
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //List<Integer> ans = IntStream.rangeClosed(1, nums.length).boxed().collect(Collectors.toList());
        List<Integer> ans = Stream.iterate(1, n -> n + 1).limit(nums.length).collect(Collectors.toList());
        for (int i=0;i<nums.length;i++) {
            ans.remove(new Integer(nums[i]));
        }
        return ans;
    }
}
