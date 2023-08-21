//to find number of occurance of target. Same as previous problem, but only involves taking the difference and adding 1, to account for the number of elements

public class Solution {
    public static int count(int array[], int n, int target) {
        //Your code goes here int n = array.length;
    int s = 0;
    int e = n -1;
    int mid = (s+e)/2;

    int leftmost = findLeftMost(array, s, e, mid, target);
    int rightmost = findRightMost(array, s, e, mid, target);

    int result = rightmost - leftmost;
    
    if (result == 0) return 0;
    return result + 1;

    }
    public static int findLeftMost(int[] arr, int s, int e, int mid, int target) {
    int ans = -1;
    while(s <= e) {
      if(arr[mid] == target) {
        ans = mid;
        e = mid -1;
      } else if(arr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
      mid = (s + e) / 2;
    }
    if(ans == -1)
    return 0;

    return ans;
  }
  public static int findRightMost(int[] arr, int s, int e, int mid, int target) {
   int ans = -1;
    while(s <= e) {
      if(arr[mid] == target) {
        ans = mid;
        s = mid + 1;
      } else if(arr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
      mid = (s + e) / 2;
    }
    if(ans == -1)
    return 0;

    return ans;
  }
}
