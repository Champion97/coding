import java.util.*;
public class Solution {
	public static final long MOD = 1000000007;
	public static long countDerangements(int n) {
		// Write your code here.
		return solveTabSO(n);

	}

	public static long solveMem(int n, long[] dp) {
		if(n==1)
		return 0;

		if(n==2)
		return 1;

		if(dp[n] != -1)
		return dp[n];
		
		dp[n] = (((n-1)%MOD) * ((solveMem(n-1, dp)%MOD) + (solveMem(n-2, dp)%MOD)) %MOD);
		
		return dp[n];
	}

	public static long solveTab(int n) {
		long[] dp = new long[n + 1];
		Arrays.fill(dp, -1);

		dp[1] = 0;
		dp[2] = 1;

		for(int i = 3; i <=n; i++) {
			dp[i] = ((i-1) * (((dp[i -1]%MOD) + (dp[i-2]%MOD))%MOD)) % MOD;
		}
		return dp[n];
	}

	public static long solveTabSO(int n) {
		// long[] dp = new long[n + 1];
		// Arrays.fill(dp, -1);

		long prev2 = 0;
		long prev1 = 1;

		for(int i = 3; i <=n; i++) {
			long ans = ((i-1) * (((prev1%MOD) + (prev2%MOD))%MOD)) % MOD;
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}
}
