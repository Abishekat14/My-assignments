package june14Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		List<Integer>list1=new ArrayList<>();
		//Adding the array values in the list
		for (int i=0;i<a.length;i++)
		{
			list1.add(a[i]);
		}
		//Printing the values in the list
		System.out.println(list1);
		
		Collections.sort(list1);
		//Printing the sorted values
		System.out.println("The sorted list is:"+list1);
		
		//Second largest number
		
//Logic-List1.get(4)(second largest number of 0 to 5)		
	int secondlargest=list1.get(list1.size()-2);
	System.out.println("SecondLargestnumberis:" +secondlargest);
	
	
	
	}

}
