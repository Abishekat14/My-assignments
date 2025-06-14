package homeAssignmentJune7;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a Software Tester";
		String s[]=test.split(" ");
		for(int i=0;i<s.length;i++)
		{
			//Checks if it is odd example am(i=1) it will reverse
			if(i%2==0)
			{
				System.out.print(s[i]);
			}
			else
			{
				char c[]=s[i].toCharArray();
				// for example if we want to print am, max length is 2 but we are going to pass the value to the array so it should be 0 and 1. 
				//Hence length-1 which will be 0 and 1	
			for(int j=c.length-1;j>=0;j--)
{
System.out.print(c[j]);
			}
		}
			System.out.print(" ");
	}
	}
}
