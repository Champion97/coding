import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		return solve(nums, n - 1, dp); //n-1 because we are solving this problem from right to left, not left to right
	}
	// public static int solve(ArrayList<Integer> nums, int n) {
	// 	if(n == 0) {
	// 		return nums.get(0);
	// 	}
	// 	if(n < 0) {
	// 		return 0;
	// 	}

	// 	int incl = solve(nums, n - 2) + nums.get(n);
	// 	int excl = solve(nums, n - 1) + 0;

	// 	return Math.max(incl, excl);
	// }

	public static int solve(ArrayList<Integer> nums, int n, int[] dp) {
		if(n == 0) {
			return nums.get(0);
		}
		if(n < 0) {
			return 0;
		}

		if(dp[n] != -1)
		return dp[n];

		int incl = solve(nums, n - 2, dp) + nums.get(n);
		int excl = solve(nums, n - 1, dp) + 0;

		dp[n] = Math.max(incl, excl);
		return dp[n];
	}

}
