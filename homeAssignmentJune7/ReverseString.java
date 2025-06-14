package homeAssignmentJune7;

public class ReverseString{

	public static void main(String[] args) {
		String input="TestLeaf";
		char s[]=input.toCharArray();
		//Prints values from reverse. Since total character is 8 and we are passing the value in array (0 to 7) length-1
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}

	}

}
