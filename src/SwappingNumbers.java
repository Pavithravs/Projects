public class SwappingNumbers {
    public static void main(String[] args){
        int x=5;
        int y=8;
        System.out.println("Before swapping");
        System.out.println("value of x is:" +x);
        System.out.println("values of y is:" +y);
        x=x+y; //13
        y=x-y; //13-8//5
        x=x-y; //13-5//8
        System.out.println("After swapping");
        System.out.println("value of xis:" +x);
        System.out.println("value of y is:" +y);
    }
}
