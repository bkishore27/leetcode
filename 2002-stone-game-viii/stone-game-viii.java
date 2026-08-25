class Solution {
    public int stoneGameVIII(int[] stones) {
        int[] dp = new int[stones.length];
        dp[0] = stones[0];
        for(int i=1;i<stones.length;i++){
            dp[i] = dp[i-1]+stones[i];
        }
        int[] res = new int[stones.length];
        res[stones.length-1] = dp[stones.length-1];
        for(int i=stones.length-2;i>=1;i--){
            res[i] = Math.max(res[i+1],dp[i]-res[i+1]);
        }
        return res[1];
    }
}