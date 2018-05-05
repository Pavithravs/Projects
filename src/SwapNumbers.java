public class SwapNumbers{
    public static void main(String[] args){
        int x = 9,y = 6,a=10,b=20,temp;

        temp=x; //9
        x=y;    //6
        y=temp; //9
        System.out.println("using third variable:");
        System.out.println("value of x is:" +x);
        System.out.println("value of y is:" +y);
        a = a+b; //10+20=30
        b = a-b; //30-20=10
        a = a-b; //30-10=20
        System.out.println("Without using third variable");
        System.out.println("value of a is:" +a);
        System.out.println("value of b is:" +b);
    }
}
