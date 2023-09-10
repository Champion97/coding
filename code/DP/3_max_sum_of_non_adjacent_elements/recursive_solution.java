//https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		return solve(nums, n - 1); //n-1 because we are solving this problem from right to left, not left to right
	}
	public static int solve(ArrayList<Integer> nums, int n) {
		if(n == 0) {
			return nums.get(0);
		}
		if(n < 0) {
			return 0;
		}

		int incl = solve(nums, n - 2) + nums.get(n);
		int excl = solve(nums, n - 1) + 0;

		return Math.max(incl, excl);
	}

}
