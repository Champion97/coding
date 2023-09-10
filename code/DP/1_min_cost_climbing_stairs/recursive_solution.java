//https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ans = Math.min(solve(cost, n-1), solve(cost, n-2));
        return ans;
    }

    public int solve(int[] cost, int n) {
        if(n == 0) {
            return cost[0];
        } 
        if(n == 1) {
            return cost[1];
        }
        return cost[n] + Math.min(solve(cost, n -1), solve(cost, n -2));
    }
}
