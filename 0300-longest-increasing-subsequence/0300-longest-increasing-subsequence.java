class Solution {
    private int solve(int[] nums, int curr_i, int prev_i, int[][] dp) {
        if (curr_i == nums.length)
            return 0;

        if (dp[curr_i][prev_i] != -1)
            return dp[curr_i][prev_i];

        int take = 0;
        if (prev_i == nums.length || nums[prev_i] < nums[curr_i])
            take = 1 + solve(nums, curr_i + 1, curr_i, dp);

        int skip = solve(nums, curr_i + 1, prev_i, dp);

        return dp[curr_i][prev_i] = Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++)
            Arrays.fill(dp[i], -1);

        return solve(nums, 0, n, dp);
    }
}