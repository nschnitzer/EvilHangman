//***************************************************
// Nathan Schnitzer
// EvilHangman.java
// 11/29/18
// Evil Hangman Game
//***************************************************
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

public class EvilHangman
{
	Scanner scan;
	StringTokenizer strTokenizer;
	TreeMap<Word> map = new TreeMap<Word>();
	public EvilHangman() throws IOException
	{
		scan = new Scanner(new File("src/words.txt"));
		strTokenizer = new StringTokenizer(scan.nextLine());
	}
	
	

}
