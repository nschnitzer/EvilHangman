import java.io.IOException;

//************************************************
// Nathan Schnitzer
// DriveHangman.java
// 12/12/18
// Contains and manages an EvilHangman game
//************************************************

import java.util.Scanner;
import java.io.*;

public class DriveHangman 
{

	public static void main(String[] args) throws IOException 
	{
		//Scanner scan = new Scanner(new File("src/inputs.txt"));
		Scanner scan = new Scanner(System.in);
		String newGame = "y";
		final int MAX_TURNS = 15;
		int turns;
		
		while (newGame.equalsIgnoreCase("y"))
		{
			turns = 0;
			EvilHangman hm = new EvilHangman();
			System.out.println("------------------------------------------------------------");
			System.out.println("\tWelcome to Evil Hangman");
			System.out.println();
			boolean gameOver = false;
			boolean hasWon = false;
			boolean hasLost = false;
			
			//Plays game
			while (gameOver == false)
			{
				try
				{
					System.out.println("Please enter your guess: (Alphabetical)");
					String g = scan.nextLine();
					char guess = g.charAt(0);
					hm.makeGuess(guess);
				}
				catch (WinnerException e)
				{
					hasWon = true;
					gameOver = true;
					System.out.println();
					System.out.println("The word was " + e.getMessage());
					break;
				}
				catch (InvalidGuessException e)
				{
					System.out.println(e.getMessage());
				}
				catch (LoseException e)
				{
					hasLost = true;
					gameOver = true;
				}
				hm.printOutcome();
				turns++;
				if (turns > MAX_TURNS)
				{
					hasWon = false;
					gameOver = true;
				}
			}
			
			//Game has ended
			System.out.println();
			if (hasWon)
			{
				System.out.println("Congratulations! You have won!");
			}
			if (hasLost)
			{
				System.out.println("You have lost Evil Hangman...");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("Do you want to play again? (Y/N)");
			newGame = scan.nextLine();
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Thank you for playing");

	}

}
