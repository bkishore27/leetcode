class Solution {
    public boolean canJump(int[] nums) {
        int distance = 0,end=0;
        if(nums.length ==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            distance = Math.max(distance,i+nums[i]);
            if(end == i){
                end = distance;
                if(distance>=nums.length-1) return true;
            }
        }return false;
    }
}