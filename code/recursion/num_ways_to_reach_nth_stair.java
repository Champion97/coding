//https://www.codingninjas.com/studio/problems/count-ways-to-reach-nth-stairs_798650?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
		return solve(nStairs, 0);
	}

	public static int solve(long nStairs, int i) {
		if(i == nStairs)
		return 1;

		if(i > nStairs)
		return 0;

		return (solve(nStairs, i+1) + solve(nStairs, i+2)) % 1000000007;
	}
}
