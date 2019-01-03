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
	/**
	 * Constructs a WordContainer object that contains a Word and an ArrayList of Integers
	 * 
	 * @param w the Word Object being stored
	 * @param locations the ArrayList of locations of the character
	 */
	public WordContainer(Word w, ArrayList<Integer> locations)
	{
		word = w;
		locs = locations;
	}
	
	//Returns the word
	/**
	 * Returns the Word object
	 * 
	 * @return the Word object
	 */
	public Word getWord()
	{
		return word;
	}
	
	//Returns the locations
	/**
	 * Returns the ArrayList containing the locations
	 * 
	 * @return the ArrayList of all the locations
	 */
	public ArrayList<Integer> getLocations()
	{
		return locs;
	}
	
	//Sets the locations of the element
	/**
	 * Sets the ArrayList containing the locations
	 * @param locations the ArrayList containing the integers
	 */
	public void setLocations(ArrayList<Integer> locations)
	{
		locs = locations;
	}
	

}
