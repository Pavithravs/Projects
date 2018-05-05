import java.util.Scanner;
public class Student {
    Scanner sc=new Scanner(System.in);
    public void fun1(){
        System.out.println("Enter the string");
        String name=sc.next();
        System.out.println("string name is:" +name);


    }
    public static void main(String[] args){
        Student obj=new Student();
        obj.fun1();
    }


}
