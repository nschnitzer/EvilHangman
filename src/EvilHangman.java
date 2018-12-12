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
	ArrayList<ArrayList<Word>> listOfLists = new ArrayList<ArrayList<Word>>();
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
	}



}
