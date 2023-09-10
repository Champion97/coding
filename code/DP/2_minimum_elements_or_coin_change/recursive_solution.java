//https://www.codingninjas.com/studio/problems/minimum-elements_3843091?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

import java.util.* ;
import java.io.*; 
public class Solution {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int ans = solve(num, x);
        if(ans == INT_MAX)
        return -1;
        return ans;
    }
    public static int solve(int num[], int x) {
        //base case
        if(x == 0)
        return 0; //if target itself is 0, return 0

        if(x < 0) 
        return INT_MAX; 

        int mini = INT_MAX;
        for(int i = 0; i < num.length; i++) {
            int ans = solve(num, x - num[i]); //update target as we have used the current num[i] coin
            if(ans != INT_MAX) {
                mini = Math.min(mini, ans + 1); //plus one to account for the current number which has been added in the previous line
            }
        }
        return mini;
    }
}
