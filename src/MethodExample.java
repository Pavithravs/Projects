public class MethodExample{
    public static int methodName1(){
        System.out.println("hello");
        return 0;
    }

    public static int methodName2(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args)
    {
        MethodExample obj=new MethodExample();
        methodName1();
        methodName2(10,20);
    }
}
