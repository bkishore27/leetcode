class Solution {
    public int missingInteger(int[] nums) {
       Set<Integer> s = new HashSet<>();
       for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
       }
       int prefix = nums[0];
       for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                prefix += nums[i];
            }
            else break;
       }
       while(s.contains(prefix)){
            prefix++;
       }
       return prefix;
    }
}