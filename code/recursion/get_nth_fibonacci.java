//https://www.algoexpert.io/questions/nth-fibonacci

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
    if(n == 1) 
      return 0;
    if(n ==2) 
      return 1;

    int ans = getNthFib(n -1) + getNthFib(n - 2);
    return ans;
    
  }
}

