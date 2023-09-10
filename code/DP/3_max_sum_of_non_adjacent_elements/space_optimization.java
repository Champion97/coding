import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		// int n = nums.size();
		// int[] dp = new int[n];
		// Arrays.fill(dp, -1);
		// return solve(nums, n - 1, dp); //n-1 because we are solving this problem from right to left, not left to right
			return solve(nums);
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

	// public static int solve(ArrayList<Integer> nums, int n, int[] dp) {
	// 	if(n == 0) {
	// 		return nums.get(0);
	// 	}
	// 	if(n < 0) {
	// 		return 0;
	// 	}

	// 	if(dp[n] != -1)
	// 	return dp[n];

	// 	int incl = solve(nums, n - 2, dp) + nums.get(n);
	// 	int excl = solve(nums, n - 1, dp) + 0;

	// 	dp[n] = Math.max(incl, excl);
	// 	return dp[n];
	// }

	// public static int solve(ArrayList<Integer> nums) {
	// 	 int n = nums.size();
    // if (n == 0) {
    //     return 0;
    // }
    // if (n == 1) {
    //     return nums.get(0);
    // }

	// 	int[] dp = new int[n];
	// 	Arrays.fill(dp, 0);

	//  dp[0] = nums.get(0);
    // dp[1] = Math.max(nums.get(0), nums.get(1));

	// 	for(int i = 2; i < n; i++) {
	// 		int incl = dp[i - 2] + nums.get(i);
	// 		int excl = dp[i - 1] + 0;
	// 		dp[i] = Math.max(incl, excl);
	// 	}
	// 	return dp[n -1 ];
	// }

	public static int solve(ArrayList<Integer> nums) {
		 int n = nums.size();
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return nums.get(0);
    }

		//int[] dp = new int[n];
	//	Arrays.fill(dp, 0);

	int prev2 = nums.get(0);
    int prev1 = Math.max(nums.get(0), nums.get(1));

		for(int i = 2; i < n; i++) {
			int incl = prev2 + nums.get(i);
			int excl = prev1 + 0;
			int ans = Math.max(incl, excl);
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}

}
