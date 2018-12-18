//****************************************************
// Nathan Schnitzer
// WinnerException.java
// 12/18/18
// Gets thrown if the player guesses the correct word
//****************************************************

public class WinnerException extends Exception
{
	//No Message
	public WinnerException()
	{
		super();
	}
	
	//With a message
	public WinnerException(String s)
	{
		super(s);
	}

}
