package Week3.day2.assignments;

import java.util.Set;

public class PrintOnlyUniqueCharacters 
{

	public static void main(String[] args)
	{

		String input = "babu";
		
		//Convert to char array
		char string [] = input.toCharArray();
		
		Set<Character> uniq = new HashSet<Character>();
		for (int i = 0; i<string.length; i++)
			if (!uniq.add(string[i]))
				uniq.remove(string[i]);

		System.out.println("Unique: " + uniq);
	}

}
