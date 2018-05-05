import java.util.Scanner; // package//

public class Var {

    Scanner sc=new Scanner(System.in);     //provides values in run time//
    static int c;
     int a,b;

    public void glob1(){
        System.out.println("Enter a,b values:");
        a=sc.nextInt();           // to read values from user//
        b=sc.nextInt();
         c=a+b;
        System.out.println("sum is:"+c);
    }

    public static void main(String[] args){
        Var obj=new Var();
                obj.glob1();


    }
}
