package homeAssignmentJune7;

public class Intersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		// compare a with all values in b
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				//if value from a[i] and b[j] matches print that one
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
