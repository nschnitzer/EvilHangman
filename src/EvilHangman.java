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
	}
	
	//Makes Subsets
	private ArrayList<Word> makeSubsets(ArrayList<Word> currentList, char guess)
	{
		//Find all possible combinations where there is the element in certain position(s)
		for (int i = 0; i < words.size(); i++)
		{
			//Stores where the element is located in the string
			ArrayList<Integer> locations = new ArrayList<Integer>();
			
			//Adds the locations to the list
			int index = words.get(i).getWord().indexOf(guess);
			while (index >= 0) {
			    locations.add(index);
			    index = words.get(i).getWord().indexOf(guess, index + 1);
			}
			if (words.size() == 0)
			{
				locations.add(-1);
			}
			
			boolean inList = false;
			WordContainer container = new WordContainer(words.get(i), locations);
			
			//Sees if the combo has been found before
			//if not it creates a new arraylist after the loop
			for (int k = 0; i < listOfLists.size(); i++)
			{
				//TODO
			}
			
			//Makes new list
			if (!inList)
			{
				listOfLists.add(new ArrayList<WordContainer>());
				listOfLists.get(listOfLists.size()-1).add(new WordContainer(words.get(i), locations));
			}
		}
	}



}
