import java.util.* ;
import java.io.*; 
public class Solution {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int minimumElements(int num[], int x) {
        // Write your code here..

//RECURSION
        // int ans = solve(num, x);
        // if(ans == INT_MAX)
        // return -1;
        // return ans;
       
//MEMOIZATION
        //step 1 : create dp array
        // int[] dp = new int[x + 1];
        // Arrays.fill(dp, -1);
        // int ans = solve2(num, x, dp);
        // if(ans != INT_MAX)
        // return ans;

        // return -1;

//TABULATION
        return solve3(num, x);



    }
    // public static int solve(int num[], int x) {
    //     //base case
    //     if(x == 0)
    //     return 0; //if target itself is 0, return 0

    //     if(x < 0) 
    //     return INT_MAX; 

    //     if(dp[x] != -1)
    //     return dp[x];

    //     int mini = INT_MAX;
    //     for(int i = 0; i < num.length; i++) {
    //         int ans = solve(num, x - num[i]); //update target as we have used the current num[i] coin
    //         if(ans != INT_MAX) {
    //             mini = Math.min(mini, ans + 1); //plus one to account for the current number which has been added in the previous line
    //         }
    //     }
    //     dp[x] = mini;
    //     return mini;
    // }

    // public static int solve2(int num[], int x, int[] dp) {
    //     //base case
    //     if(x == 0)
    //     return 0; //if target itself is 0, return 0

    //     if(x < 0) 
    //     return INT_MAX; 
    //     if(dp[x] != -1) {
    //         return dp[x];
    //     }

    //     int mini = INT_MAX;
    //     for(int i = 0; i < num.length; i++) {
    //         int ans = solve2(num, x - num[i], dp); //update target as we have used the current num[i] coin
    //         if(ans != INT_MAX) {
    //             mini = Math.min(mini, ans + 1); //plus one to account for the current number which has been added in the previous line
    //         }
    //     }
    //     dp[x] = mini;
        
    //     return mini;
    // }

    public static int solve3(int num[], int x) {
       int[] dp = new int[x + 1];
       Arrays.fill(dp, INT_MAX);

        dp[0] = 0;
       for(int i = 1; i <= x; i++) {
           for(int j = 0; j < num.length; j++) {
               if(i - num[j] >= 0 && dp[i - num[j]] != INT_MAX)
               dp[i] = Math.min(dp[i], 1 + dp[i - num[j]]);
           }
       }
       if(dp[x] == INT_MAX)
        return -1;
        return dp[x]; 
    }
}
