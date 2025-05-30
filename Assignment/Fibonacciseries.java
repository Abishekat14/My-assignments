package Assignment;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n1=0,n2=1;
		int sum;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=1;i<=6;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}
