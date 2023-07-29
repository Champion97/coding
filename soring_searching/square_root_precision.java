public class HelloWorld {
    public static void main(String[] args) {
        int tempSolution = findSquareRoot(8);
        System.out.println("temp solution is : " + tempSolution);
        System.out.println("Result is : "  + morePrecision(8, 3, tempSolution));
    }
    public static int findSquareRoot(int n) {
        int s = 0;
        int ans = -1;
        int e = n;
        int mid = (s + e) /2;
        while(s <= e) {
            if(mid * mid == n) {
                return mid;
            } else if( mid * mid < n) {
                ans = mid;
                s = mid +1;
            } else {
                e = mid -1;
            }
            mid = ( s + e) /2;
        }
        return ans;
    }
    
    public static float morePrecision(int n, int prec, int temp) {
        float factor = 1;
        float ans = temp;
        
        for ( int i = 0; i < prec; i++) {
            factor = factor / 10;
        for(float j = ans; j*j < n; j = j + factor) {
            ans = j;
        }
        }
        return ans;
    }
 }
 
