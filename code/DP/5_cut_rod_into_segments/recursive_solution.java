https://www.codingninjas.com/studio/problems/cut-into-segments_1214651?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

public class Solution {

    public static final int INT_MIN = Integer.MIN_VALUE;
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.
        int ans = solve(n, x, y, z);
        if(ans < 0) 
        return 0;

        return ans;
    }

    public static int solve(int n, int x, int y, int z) {
        //base case
        if(n == 0)
        return 0;

        if(n < 0)
        return INT_MIN;
//+1 to account for current segment
        int a = solve(n-x, x, y, z) + 1;
        int b = solve(n-y, x, y, z) + 1;
        int c = solve(n-z, x, y, z) + 1;
        
        int ans = Math.max(a,Math.max(b,c));
        return ans;
    }
}
