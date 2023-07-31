//https://www.codingninjas.com/studio/problems/ayush-and-ninja-test_1097574?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio


import java.util.* ;
import java.io.*; 
public class Solution {

    
    public static int allocateBooks(ArrayList<Integer> pages,int n ,int b) {
        // Write your code here.

        if(b > n) {
            return -1;
        }
        int s = 0;
        int sum = 0;
       // int n = pages.size();
        for(int i = 0; i < n; i++) {
            sum = sum + pages.get(i);
        }
        int e = sum;
        int mid = (s + e) / 2;
        int ans = -1;

        while(s <= e) {
            if(isPossibleSolution(mid, n, pages, b)) {
                ans = mid;
                e = mid -1;
            } else {
                s = mid + 1;
            }
            mid = (s+e) /2;
        }
        return ans;
    }

    public static boolean isPossibleSolution(int mid, int n, ArrayList<Integer> pages, int b) {
       // int n = pages.size();
        int countOfStudents = 1;
        int pageSum = 0;

        for(int i = 0; i < n; i++) {
            if(pageSum + pages.get(i) <= mid) {
                pageSum += pages.get(i);
            } else {
                countOfStudents++;
                if(countOfStudents > b || pages.get(i) > mid) {
                    return false;
                }
                pageSum = pages.get(i);
            }

        }
        return true;

    }
}

2
