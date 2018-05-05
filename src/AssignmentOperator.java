public class AssignmentOperator {
    public static void main(String[] args){
        int num1=10;
        num1 += 1;
        System.out.println("result of add assignment: " +num1);
        num1 -= 1;
        System.out.println("result of sub assignment: " +num1);
        num1 *= 3;
        System.out.println("result of mul assignment: " +num1);
        num1 /= 3;
        System.out.println("result of div assignment: " +num1);
        num1 %= 4;
        System.out.println("result of mod assignment: " +num1);
    }
}
