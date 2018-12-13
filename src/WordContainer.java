//*******************************************************
// Nathan Schnitzer
// WordContainer.java
// 12/13/18
// Contains a Word object and the set of locations an element occurs within the word
//*******************************************************
	
import java.util.ArrayList;

public class WordContainer 
{
	private Word word;
	private ArrayList<Integer> locs = new ArrayList<Integer>();
	
	//Construct a WordContainer element
	public WordContainer(Word w, ArrayList<Integer> locations)
	{
		word = w;
		locs = locations;
	}
	
	public Word getWord()
	{
		return word;
	}
	
	public ArrayList<Integer> getLocations()
	{
		return locs;
	}
	
	public void setLocations(ArrayList<Integer> locations)
	{
		locs = locations;
	}

}
