class Solution {
    public int minPathSum(int[][] grid) {
        int s = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[s][n];
        dp[0][0] = grid[0][0];
        
        int maxLimit = Math.max(s, n);

        for (int i = 1; i < maxLimit; i++) {
            if (i < n) {
                dp[0][i] = dp[0][i - 1] + grid[0][i];
            }
            if (i < s) {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }
        }

        for(int i=1;i<s;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }return dp[s-1][n-1];
    }
}