package june14Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingMissingElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,10,6,8};
		List<Integer>list1=new ArrayList<>();
for(int i=0;i<a.length;i++)
{
	list1.add(a[i]);
}
//Printing the list after sorting
Collections.sort(list1);
System.out.println(list1);
//Sorted values are{1,2,3,4,6,8,10}
//Giving size-1 because after 8 (i(6)) we do not have i(7) to compare with)
//so it will take values upto i(5) that is 6
for(int i=0;i<list1.size()-1;i++)
{
	//compares each numbers
	//Example i(3) is 4 and i(4) should be 5. But 6 is present and difference is 2. 
	//Here we take 6 as next and 4 as current. 
	//j=5(current +1); 5<6 Then it prints 5
	//Simiilarly it prints vales between 6 and 8, 8 and 10
	if(list1.get(i+1)-list1.get(i)>1)
	{
		int current=list1.get(i);
		int next=list1.get(i+1);
		if(next-current>1)
		{
			for(int j=current+1;j<next;j++)
			{
				System.out.println("The missing values are:"+j);
			}
		}
	}
	
}
	}

}
