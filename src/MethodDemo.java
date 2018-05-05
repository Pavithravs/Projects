public class MethodDemo {
    public  void myMethod(int x,int y){
            int z=x*y;
            System.out.println("multiplication is: " +z );
    }
    public static void main(String[] args){
        MethodDemo ob=new MethodDemo();
        ob.myMethod(3,5);
    }
}
