import java.util.*;

class Guesser
{
	int guessNum;
	int Guesser()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number:");
		guessNum = sc.nextInt();
		return guessNum;
	}
}
class Players
{
	int guessNum;
	int Player()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("player kindly guess the number:");
		guessNum = sc.nextInt();
		return guessNum;
		
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void NumFromGuesser()
	{
		Guesser in =new Guesser();
		numFromGuesser = in.Guesser();
	}
	
	void NumFromPlayers()
	{
		Players p1 =new Players();
		Players p2 =new Players();
		Players p3 =new Players();
		numFromPlayer1 = p1.Player();
		numFromPlayer2 = p2.Player();
		numFromPlayer3 = p3.Player();
		
	}
	void Compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 )
			System.out.println("all the players are won the game!");
			else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2)
				System.out.println("player1 and player2 won the game");
			else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3)
				System.out.println("player1 and player3 won the game");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			System.out.println("player2 and player3 won the game!");
			else 
			{
				System.out.println("player2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("player3 is won the game!");
		}
		else
		{
			System.out.println("loss the game try again!");
		}
	}
	
}


public class GuesserGame {

	public static void main(String[] args) {
		Umpire g = new Umpire();
		g.NumFromGuesser();
		g.NumFromPlayers();
		g.Compare();

	}

}
