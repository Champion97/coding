//https://www.tutorialspoint.com/online_java_compiler.php

public class HelloWorld{

    public static void printCount(int n) {
        if(n == 0) {
            return;
        }
        
        System.out.println(n);
        printCount(n -1);
    }
     public static void main(String []args){
       printCount(10);
     }
}
