//https://www.codingninjas.com/studio/problems/square-root_893351?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2

class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int mid = (s + e) / 2;
        int ans = -1;
        while( s <= e) {
            if(mid * mid == x) {
                return mid;
            } else if( mid * mid < x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid -1;
            }
            mid = (s + e) /2;
        }
        return ans;
    }
}
