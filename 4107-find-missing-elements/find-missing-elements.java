class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList n = new ArrayList<>();
        Arrays.sort(nums);
        int low = nums[0],i=0;int high = nums[nums.length-1];
        while(low<=high){
            if(i<nums.length && low==nums[i]) i++;
            else n.add(low);
            low++;
        }
        return n;
    }
}