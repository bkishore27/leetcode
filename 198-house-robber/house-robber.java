class Solution {
    public int rob(int[] nums) {
        int cur =0 ;
        int premax = 0;
        for(int n:nums){
            int temp = cur;
            cur = Math.max(premax+n,cur);
            premax = temp;
        }
        return cur;
    }
}