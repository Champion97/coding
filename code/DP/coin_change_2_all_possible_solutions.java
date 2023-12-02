//https://leetcode.com/problems/coin-change-ii/submissions/

//find the number of combinations to make a target from given array of coins

class Solution {
    public int change(int amount, int[] coins) {
    int[] dp = new int[amount + 1];
    dp[0] = 1;

    for (int coin : coins) {
        for (int i = coin; i <= amount; i++) {
            dp[i] += dp[i - coin];
        }
    }

    return dp[amount];
    }
}
