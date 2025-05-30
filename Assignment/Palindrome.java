package Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int number=16361;
		int reminder=0;
		int originalnumber=number;
		while(number!=0)
		{
			reminder=reminder*10+number%10;
			number=number/10;
		}
		System.out.println(reminder);
		
	if(originalnumber== reminder)
	{
		System.out.println("The given number is a palindrome");
	}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
			
	}
	}


