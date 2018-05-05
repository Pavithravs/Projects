import java.util.Scanner;

public class Fibo {


    public static void main(String[] args){
        int fib1=0,fib2=1,fib,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibonacci series");
        n=sc.nextInt();
        for(int count=3;count<=n;count++) {

            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        System.out.println(" " +fib1);
        System.out.println(" " +fib2);
        }
    }




