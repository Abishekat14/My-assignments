package Assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=15;
		int count=0;
          for(int i=1; i<=num;i++)
          {
        	  if(num%i==0)
        	  {
        		  count++;
        	  }
          }
          
          if(count==2)
          {
        	  System.out.println("The number is a prime number");
          }
          else
          {
        	  System.out.println("The number is not a prime number");
          }
}
}