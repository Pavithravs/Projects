public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = (x > 10) ? x : y;
        System.out.println(" result1 is: " +result);
        result = (y >10) ? x : y;
        System.out.println("result2 is: " +result);
    }
}
