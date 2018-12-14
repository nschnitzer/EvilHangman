//***************************************************
// Nathan Schnitzer
// EvilHangman.java
// 11/29/18
// Evil Hangman Game
//***************************************************
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class EvilHangman
{
	Scanner scan;
	StringTokenizer strTokenizer;
	ArrayList<ArrayList<WordContainer>> listOfLists = new ArrayList<ArrayList<WordContainer>>();
	ArrayList<Word> words = new ArrayList<Word>();

	//Constructs EvilHangman game
	public EvilHangman() throws IOException
	{
		scan = new Scanner(new File("src/words.txt"));
		while (scan.hasNextLine())
		{
			String word = scan.nextLine();
			words.add(new Word(word));
		}
		makeSubsets(words, 'a');
	}

	//Makes Subsets
	private ArrayList<ArrayList<WordContainer>> makeSubsets(ArrayList<Word> currentList, char guess)
	{
		//Find all possible combinations where there is the element in certain position(s)
		for (int i = 0; i < words.size(); i++)
		{
			//Stores where the element is located in the string
			ArrayList<Integer> locations = new ArrayList<Integer>();

			//Adds the locations to the list
			//Lowercase
			int index = words.get(i).getWord().indexOf(Character.toLowerCase(guess));
			while (index >= 0) {
				locations.add(index);
				index = words.get(i).getWord().indexOf(Character.toLowerCase(guess), index + 1);
			}
			
			//UpperCase
			index = words.get(i).getWord().indexOf(Character.toUpperCase(guess));
			while (index >= 0) {
				locations.add(index);
				index = words.get(i).getWord().indexOf(Character.toUpperCase(guess), index + 1);
			}
			if (words.size() == 0)
			{
				locations.add(-1);
			}

			boolean inList = true;
			WordContainer container = new WordContainer(words.get(i), locations);

			//Sees if the combo has been found before
			//if not it creates a new arraylist after the loop
			if (listOfLists.size() == 0)
			{
				listOfLists.add(new ArrayList<WordContainer>());
				listOfLists.get(0).add(container);
			}
			else
			{
				for (ArrayList<WordContainer> c: listOfLists)
				{
					inList = true;
					//If there are a different amount of locations in c than container
					if (c.get(0).getLocations().size() != container.getLocations().size())
					{
						inList = false;
						continue;
					}

					//Compares the elements in the lists
					for (int k = 0; k < c.get(0).getLocations().size(); k++)
					{
						if (c.get(0).getLocations().get(k) == container.getLocations().get(k))
						{
							continue;
						}
						else
						{
							inList = false;
							break;
						}
					}

					if (inList)
					{
						c.add(container);
						break;
					}
				}

				//Makes new list
				if (!inList)
				{
					listOfLists.add(new ArrayList<WordContainer>());
					listOfLists.get(listOfLists.size()-1).add(container);
				}
			}
		}

		for (ArrayList<WordContainer> arr : listOfLists)
		{
			System.out.println(arr.size() + "\t" + arr.get(0).getLocations().toString());
		}

		return listOfLists;
	}
	
	public boolean makeGuess(char guess)
	{
		//TODO: Exception checking for invalid input
		
		//get the subsets
		ArrayList<ArrayList<WordContainer>> subsets = makeSubsets(words, guess);
		
		int largest = 0;
		ArrayList<ArrayList<WordContainer>> largestArrays = new ArrayList<ArrayList<WordContainer>>();
		//Determine which subset to use
		for (ArrayList<WordContainer> arr : subsets)
		{
			if (arr.size() > largest)
			{
				largest = arr.size();
				largestArrays.add(arr);
			}
		}
	}



}
