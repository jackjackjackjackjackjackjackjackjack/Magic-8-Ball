import java.util.Scanner;
public class MagicIsSpooky
	{
static int randomNumber;
boolean gameContinues;

		public static void main(String[] args)
			{
			greetPlayer();
			generateNumber();
			generateResponse();
			}
		public static void greetPlayer()
			{
			Scanner userInput = new Scanner (System.in);
			System.out.println("I am the magic conch shell! Ask me a yes or no question and then see my great answer!");
			String question = userInput.nextLine();
			}
		public static void generateNumber()
			{
			randomNumber = (int)(Math.random()*6) + 1;
			}
		public static void generateResponse()
			{
			switch(randomNumber)
			{
				case 1:
						{
						System.out.println("Absolutely!");
						break;
						}
				case 2:
						{
						System.out.println("Definitely not!");
						break;
						}
				case 3:
						{
						System.out.println("Please try again in 10 minutes.");
						break;
						}
				case 4:
						{
						System.out.println("Uh, maybe.");
						break;
						}
				case 5:
						{
						System.out.println("Totally! (haha jk lol)");
						break;
						}
				case 6:
						{
						System.out.println("Yes.");
						break;
						}
						}
		
	}
	}
