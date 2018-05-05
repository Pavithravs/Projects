import java.util.Scanner;
public class Character {
    Scanner sc=new Scanner(System.in);
    char ch1;
    char ch2;
    public void fun1(){
        System.out.println("Enter the values of ch1 and ch2:");
        ch1=sc.next().charAt(0);
        // ch2=sc.next().charAt(0);
        ch2=sc.next().charAt(2);
        System.out.println("values of char variable:"+ch1);
        System.out.println("values of char variable:"+ch2);
    }

    public static void main(String[] args){
        Character obj=new Character();
        obj.fun1();

    }
}
