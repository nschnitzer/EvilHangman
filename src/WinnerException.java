//****************************************************
// Nathan Schnitzer
// WinnerException.java
// 12/18/18
// Gets thrown if the player guesses the correct word
//****************************************************

public class WinnerException extends Exception
{
	//No Message
	/**
	 * Calls the Exception superclass and throws an exception
	 */
	public WinnerException()
	{
		super();
	}
	
	//With a message
	/**
	 * Calls the Exception parent class with a String message as a parameter and throws an exception 
	 * 
	 * @param s the message to be thrown with the exception
	 */
	public WinnerException(String s)
	{
		super(s);
	}

}
