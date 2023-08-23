//https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio

import java.util.Arrays;

public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int s = 0;
        int maxi = -1;
        int n = stalls.length;
        for(int i = 0; i < n; i++) {
            maxi = Math.max(maxi, stalls[i]);
        }

        int e = maxi;
        int mid = (s+e) / 2;
        int ans = -1;

        while(s <= e) {
            if(isPossibleSolution(mid, n, k, stalls)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = (s+e) / 2;
        }
            return ans;
    }

    public static boolean isPossibleSolution(int mid, int n, int k, int[] stalls) {
        int cowCount = 1;
        int lastPos = stalls[0];

        for(int i = 0; i < n; i++) {
            if(stalls[i] - lastPos >= mid) {
                cowCount++;
                if(cowCount == k) {
                    return true;
                }
                lastPos = stalls[i];
            }
            
        }
       return false;
    }
}2
