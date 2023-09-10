class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int n = cost.length;
        // int ans = Math.min(solve(cost, n-1), solve(cost, n-2));
        // return ans;


        // int n = cost.length;
        // //Step 1 : Create a dp array of size n + 1
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        // int ans = Math.min(solve(cost, n - 1, dp), solve(cost, n - 2, dp));
        // return ans;

        int n = cost.length;
        return solve(cost, n);
    }

    public int solve(int[] cost, int n) {
        //Step 1 : Create new dp array
       // int[] dp = new int[n + 1];
        //Step 2 : Analyse base case
        int prev2 = cost[0];
        int prev1 = cost[1];

        //Step 3 : for loop
        for(int i = 2; i < n; i++) {
            //dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            int curr = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev1, prev2);
    }
}
