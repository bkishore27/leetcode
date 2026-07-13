class Solution {
    public int jump(int[] nums) {
        int flag =0,jump = 0, dis = 0 , end =0 ;
        if(nums.length == 1) return 0;
        for(int i=0;i<nums.length;i++){
            dis = Math.max(dis,i+nums[i]);
            if(end == i){
                end = dis;
                jump++;
                if(dis>=nums.length-1){flag =1 ;break;}
            }
        }
        if(flag == 0) return -1;
        return jump;
    }
}