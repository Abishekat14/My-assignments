package homeAssignmentJune7;

public class Duplicatewords {

	public static void main(String[] args) {
		String test="We learn Java basics as part of java sessions in java week1";
		String s[]=test.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			{
				//Compares we with other words. Similarly Learn with other words
				for(int j=i+1;j<s.length;j++)
				{
					//Compares the other characters and if it matches space will be printed and using equals ignore case (example considers J=j)
					if(s[i].equalsIgnoreCase(s[j]))
					
					{
						s[j]=" ";
						count++;
					}
				}
			}
		}
		
		for(int i=0;i<s.length;i++)
		System.out.print(s[i]);

	}

}
