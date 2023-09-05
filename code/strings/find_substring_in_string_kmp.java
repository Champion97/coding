//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/

//https://www.youtube.com/watch?v=0iDiUuHZE_g&t=407s


class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int[] lps = calculateLPS(needle);
        if(needle.isEmpty())
        return 0;

        while(i < haystack.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j == needle.length())
                return i - j;
            } else {
                if(j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public int[] calculateLPS(String needle) {
        int[] lps = new int[needle.length()];
        int len = 0;

        for(int i = 1; i < needle.length();) {
            if(needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len -1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
