class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++ )
                m.put(nums[j],m.getOrDefault(nums[j],0)+1);
        }
        int res = -1;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()==1){
                res = Math.max(res,e.getKey());
            }
        }
        return res;
    }
}