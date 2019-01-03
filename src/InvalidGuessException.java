//*******************************************************
// Nathan Schnitzer
// InvalidGuessException.java
// 12/18/18
// Gets thrown if there is an invalid guess is played
//*******************************************************

public class InvalidGuessException extends Exception
{
	//No message
	/**
	 * Calls the Exception parent class and throws an exception
	 */
	public InvalidGuessException()
	{
		super();
	}
	
	//With message
	/**
	 * Calls the Exception parent class with a String parameter and throws an exception
	 * 
	 * @param s the message to be thrown with the exception
	 */
	public InvalidGuessException(String s)
	{
		super(s);
	}

}
