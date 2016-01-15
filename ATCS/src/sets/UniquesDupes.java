package sets;

import java.util.Set;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static void main(String[] args)
	{
		Set<String> uniques = getUniques("a b c d e f g h a b c d e f g h i j k");
		Set<String> dupes = getDupes("a b c d e f g h a b c d e f g h i j k");
		System.out.println("Original List : " + "a b c d e f g h a b c d e f g h i j k");
		System.out.println("Uniques : " + uniques);
		System.out.println("Dupes : " + dupes);
		System.out.println();
		Set<String> uniques2 = getUniques("one two three one two three six seven one two");
		Set<String> dupes2 = getDupes("one two three one two three six seven one two");
		System.out.println("Original List : " + "one two three one two three six seven one two");
		System.out.println("Uniques : " + uniques2);
		System.out.println("Dupes : " + dupes2);
		System.out.println();
		Set<String> uniques3 = getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		Set<String> dupes3 = getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Original List : " + "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Uniques : " + uniques3);
		System.out.println("Dupes : " + dupes3);


	}
	
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		String[] words = input.split(" ");
		for (String word : words)
		{
			boolean hasDupe = false;

			for (String w : uniques)
			{
				if (word.equals(w))
				{
					hasDupe = true;
				}
			}
			if (!hasDupe)
				uniques.add(word);
		}

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		Set<String> uniques = new TreeSet<String>();

		String[] words = input.split(" ");
		for (String word : words)
		{
			boolean hasDupe = false;

			for (String w : uniques)
			{
				if (word.equals(w))
				{
					hasDupe = true;
				}
			}
			if (!hasDupe)
				uniques.add(word);
			if (hasDupe)
				dupes.add(word);
		}

		return dupes;
	}
}