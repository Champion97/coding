class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n -1;
        int mid = (s + e) / 2;

        while(s < e ) {
            if(arr[mid] >= arr[0]) {
                s = mid+1;
            } else {
                e = mid;
            }
            mid = (s+e)/2;
        }
        return s;
    }
}
