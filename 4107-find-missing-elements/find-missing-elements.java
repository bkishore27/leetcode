class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList n = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int low = nums[0],high = nums[0];
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]<low) low = nums[i];
            if(nums[i]>high) high = nums[i];
        }
        for(int i=low;i<=high;i++){
            if(!set.contains(i)) n.add(i);
        }
        return n;
    }
}