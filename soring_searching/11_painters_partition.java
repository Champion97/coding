//https://www.codingninjas.com/studio/problems/painter's-partition-problem_1089557?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio

import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        
        int s = 0;
        int sum = 0;
        int n = boards.size();
        if(k > n) {
            return -1;
        }
        for(int i = 0; i < n; i++) {
            sum += boards.get(i);
        }
        int e = sum;
        int mid = (s+e) /2;
        int ans = -1;

        while(s <= e) {
            if(isPossibleSolution(mid, n, k, boards)) {
                ans = mid;
                e = mid -1;
            } else {
                s = mid +1;
            }
            mid = (s+e) /2;
        }
        return ans;
    }

    public static boolean isPossibleSolution(int mid, int n, int k, ArrayList<Integer> boards) {
        int countMen = 1;
        int areaSum = 0;

        for(int i = 0; i < n; i++) {
            if(areaSum + boards.get(i) <= mid) {
                areaSum += boards.get(i);
            } else {
                countMen++;
                if(countMen > k || boards.get(i) > mid) {
                    return false;
                }
                areaSum = boards.get(i);
            }
        }
        return true;
    }
}2
