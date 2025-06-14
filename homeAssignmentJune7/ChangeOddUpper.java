package homeAssignmentJune7;

public class ChangeOddUpper {

	public static void main(String[] args) {
		String test="changeme";
		//Changing odd characters to uppercase(that is =1,i=3 etc..)
		char c[]=test.toCharArray();
				for(int i=0;i<c.length;i++)
				{
					if(i%2!=0)
					{
						c[i]=Character.toUpperCase(c[i]);
					}
				}
				
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]);
				}

	}

}
