import java.io.*;
public class D1D5 {
    static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n =10;
        for(int i=1;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }

}
