package june14Assignments;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		//Entering values into array
	int a[]= {3,2,11,4,6,7};
	int b[]= {1,2,8,4,9,7};
	//Declaring lists and then will pass array values to list via for loop
	List<Integer> list1 =new ArrayList<>();
	List<Integer>list2=new ArrayList<>();
	
	// Declaring forloop and passing array vales with the help of add function
	for(int i=0;i<a.length;i++)
	{
		list1.add(a[i]);	
	}
	System.out.println(list1);
	
	for(int i=0;i<b.length;i++)
	{
	  list2.add(b[i]);
	}
	System.out.println(list2);
	
	//Comparing list 1 and list values with the help of for loop
	for(int i=0;i<list1.size();i++)
	{
		for (int j=0;j<list2.size();j++)
		{
			if(list1.get(i).equals(list2.get(j)))
			{
				System.out.println("The intersecting values are:"+list1.get(i));
			}
		}

	}
	}
}
