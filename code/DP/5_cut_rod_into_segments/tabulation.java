import java.util.*;
public class Solution {

    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.
        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);

        return solve(n, x, y, z);
    }

    public static int solve(int n, int x, int y, int z) {
     int[] dp = new int[n+1];
     Arrays.fill(dp, INT_MIN);

     dp[0] = 0;
     
     for(int i = 1; i <=n; i++) {
         if((i-x) >=0)
         dp[i] = Math.max(dp[i], dp[i-x] + 1);
          if((i-y) >=0)
         dp[i] = Math.max(dp[i], dp[i-y] + 1);
          if((i-z) >=0)
         dp[i] = Math.max(dp[i], dp[i-z] + 1);
         
     }
     if(dp[n] < 0)
     return 0;
     
     return dp[n];
    }
}
