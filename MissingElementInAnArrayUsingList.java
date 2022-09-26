package Week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayUsingList
{

	public static void main(String[] args) 
	{
		//Declare the integer array
				Integer [] arr = {1,2,3,4,7,6,8};
				
				//Convert the Array to List
				List<Integer> list = Arrays.asList(arr);
				
				//Sort List and print
				Collections.sort(list);
				System.out.println("List: " + list);
				
				//Logic to find the missing element in the list
				for (int i=0; i <list.size(); i++)
				{
					if (list.get(i) != (i+1)) {
						System.out.println("Missing Element: " + (i+1));
						break;
					}
	}
	}
	public MissingElementInAnArrayUsingList ( )
	{
		// TODO Auto-generated constructor stub
	}


