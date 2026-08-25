class Solution {
    public int stoneGameVIII(int[] stones) {
        int[] dp = new int[stones.length];
        dp[0] = stones[0];
        for(int i=1;i<stones.length;i++){
            dp[i] = dp[i-1]+stones[i];
        }
        int max = dp[stones.length-1];
        for(int i=stones.length-2;i>=1;i--){
            max = Math.max(max,dp[i]-max);
        }
        return max;
    }
}