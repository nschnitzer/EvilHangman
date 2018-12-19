//****************************************************************
// Nathan Schnitzer
// LoseExcepton.java
// 12/19/18
// Gets thrown if the player runs out of turns
//****************************************************************


public class LoseException extends Exception
{
	//No message
	public LoseException()
	{
		super();
	}
	
	//With message
	public LoseException(String s)
	{
		super(s);
	}

}
