
public class Fibonaci {
    public static void main(String[] args){
        int fib1=0,fib2=1,fib;
        System.out.println("Fibonaci series is:");
        System.out.println(" "+fib1);
        System.out.println(" "+fib2);
        for(int i=1;i<=5;i++)
        {
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
            System.out.println(" "+fib);
        }
    }
}
