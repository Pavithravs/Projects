public class Prime {
    public static void main(String[] args){
        int num=23;
        boolean isPrime=true;
        for(int i=2;i<num;i++)
        {
          if(num%i==0)
          {
              isPrime=false;
              break;
          }
        }
        if(isPrime)
            System.out.println(num+ "It is a prime number");
        else
            System.out.println(num+ "It is not a prime number");
    }
}
