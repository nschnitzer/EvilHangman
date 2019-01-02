//*************************************
// Nathan Schnitzer
// Word.java
// 12/3/18
// Describes a Word object
//*************************************

import java.util.stream.*;
import java.util.ArrayList;
public class Word 
{
	private String word;
	private double complexity;
	
	public Word(String w)
	{
		word = w.toLowerCase();
		calculateComplexity(w);
	}
	
	//Returns the word
	public String getWord()
	{
		return word;
	}
	
	//Returns the complexity
	public double getComplexity()
	{
		return complexity;
	}
	
	//Calculates complexity
	public void calculateComplexity(String word)
	{
		int length = word.length();
		int penalties = 0;
		int differentLetters = 0;
		String wordTemp = word;
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < wordTemp.length(); i++)
		{
			if (list.contains(wordTemp.charAt(i)) == false);
			{
				list.add(wordTemp.charAt(i));
			}
		}
		differentLetters = list.size();
		if (word.contains("an"))
		{
			penalties++;
		}
		
		if (word.contains("r"))
		{
			penalties++;
		}
		
		if (word.contains("s"))
		{
			penalties++;
		}
		if (word.contains("t"))
		{
			penalties++;
		}
		
		if (word.contains("l"))
		{
			penalties++;
		}
		
		if (word.contains("n"))
		{
			penalties++;
		}

		if (word.contains("e"))
		{
			penalties++;
		}
		
		if (word.contains("ly"))
		{
			penalties++;
		}
		
		if (word.contains("ce"))
		{
			penalties++;
		}
		
		if (word.contains("ck"))
		{
			penalties++;
		}
		
		if (word.contains("le"))
		{
			penalties++;
		}
		double score = 0.0;
		score = (differentLetters + (penalties / length)) / length;
	}
	

}
