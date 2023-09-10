//https://www.codingninjas.com/studio/problems/house-robber_839733?leftPanelTab=1&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

import java.util.* ;
import java.io.*; 
public class Solution {
	public static long solve(ArrayList<Integer> nums) {
		 int n = nums.size();
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return nums.get(0);
    }

		//int[] dp = new int[n];
	//	Arrays.fill(dp, 0);

	long prev2 = nums.get(0);
    long prev1 = Math.max(nums.get(0), nums.get(1));

		for(int i = 2; i < n; i++) {
			long incl = prev2 + nums.get(i);
			long excl = prev1 + 0;
			long ans = Math.max(incl, excl);
			prev2 = prev1;
			prev1 = ans;
		}
		return prev1;
	}
	public static long houseRobber(int[] valueInHouse) {
		// Write your code here.

		int n = valueInHouse.length;

		if(n == 1)
		return valueInHouse[0];

		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			if(i != n - 1) {
				first.add(valueInHouse[i]);
			}
			if(i != 0) {
				second.add(valueInHouse[i]);
			}
		}
		return Math.max(solve(first), solve(second));
	}	
}
