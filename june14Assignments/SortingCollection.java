package june14Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		String a[]= {"HCL", "Wipro","Aspire system", "CTS"};
		List<String>list1=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			//Adding the company names in the list from Arrays
			list1.add(a[i]);
		}
		System.out.println(list1);
		//Sorting the lists
		Collections.sort(list1);
		System.out.println("The sorted list is:"+list1);
		//Printing the sorted strings in the reverse order that is from the last
		for(int i=list1.size()-1;i>=0;i--)
		{
			list1.get(i);
		}
		System.out.println("Sorted list is:"+list1);
	}

}
