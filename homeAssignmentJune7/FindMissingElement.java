package homeAssignmentJune7;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[]= {1,4,3,2,8,6,7};
		// Pattern is if the index is 0- value 1, similarly index 2 value 3. So in index 4, value shoud be 5
		//1,2,3,4,6,7,8- Sorted values
		Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=i+1)
				{
					System.out.println("The missing element is:"+(i+1));
					return;
					//Index 4 it prints 5 and the  we should stop by using return, 
					//The goal is to print 5 only if not given return 6 and 7 will be printed
					
				}
		}

	}

}
