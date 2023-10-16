import java.util.*;
public class Solution {
	public static final long MOD = 1000000007;
	public static long countDerangements(int n) {
		// Write your code here.
		long[] dp = new long[n+1];
		Arrays.fill(dp, -1);
		return solveMem(n, dp);

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
}
