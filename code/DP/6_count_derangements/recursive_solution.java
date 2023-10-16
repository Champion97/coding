//https://www.codingninjas.com/studio/problems/count-derangements_873861?leftPanelTab=0&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

public class Solution {
	public static long countDerangements(int n) {
		// Write your code here.
		if(n==1)
		return 0;

		if(n==2)
		return 1;
		
		long ans = (n-1) * (countDerangements(n-1) + countDerangements(n-2));
		
		return ans;
	}
}
