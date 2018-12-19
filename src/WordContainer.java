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
	
	//Returns the word
	public Word getWord()
	{
		return word;
	}
	
	//Returns the locations
	public ArrayList<Integer> getLocations()
	{
		return locs;
	}
	
	//Sets the locations of the element
	public void setLocations(ArrayList<Integer> locations)
	{
		locs = locations;
	}
	

}
