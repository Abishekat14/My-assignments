package homeAssignmentJune7;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		//Comparing the lengths of text 1 and text 2
		if(text1.length()==text2.length())
		{
			System.out.println("Length is equal");
		}
		
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		char c[]=text1.toCharArray();
		char d[]=text2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		//Comparing two characters present in the Array are equal
				if(Arrays.equals(c, d))
				{
					System.out.println("The given Strings are in anagram");
				}
					else
					{
						System.out.println("The given strings are not an Anagram");
					}
		}

	}

