/https://www.tutorialspoint.com/online_java_compiler.php

public class HelloWorld{

public static int findPowerOfTwo(int n) {
    if(n ==0) {
        return 1;
    }
    
    return 2 * findPowerOfTwo(n -1);
}
     public static void main(String []args){
        System.out.println(findPowerOfTwo(5));
     }
}
