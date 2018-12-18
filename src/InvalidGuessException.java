//*******************************************************
// Nathan Schnitzer
// InvalidGuessException.java
// 12/18/18
// Gets thrown if there is an invalid guess is played
//*******************************************************

public class InvalidGuessException extends Exception
{
	//No message
	public InvalidGuessException()
	{
		super();
	}
	
	//With message
	public InvalidGuessException(String s)
	{
		super(s);
	}

}
