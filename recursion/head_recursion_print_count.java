//https://www.tutorialspoint.com/online_java_compiler.php

public class HelloWorld{

    public static void printCount(int n) {
        if(n == 0) {
            return;
        }
        
        printCount(n -1);
        System.out.println(n);
    }
     public static void main(String []args){
       printCount(10);
     }
}
