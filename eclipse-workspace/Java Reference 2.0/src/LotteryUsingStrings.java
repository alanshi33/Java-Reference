import java.util.Scanner;

public class LotteryUsingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		String guess = input.nextLine();

		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		char lotteryDigit3 = lottery.charAt(2);

		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
		char guessDigit3 = guess.charAt(2);

		System.out.println("The lottery number is " + lottery);

		if (guess.equals(lottery))
			System.out.println("Exact match: you win $1,000");
		
		else if (guessDigit2 == lotteryDigit1 && 
				guessDigit1 == lotteryDigit2 && 
				guessDigit2 == lotteryDigit3 && 
				guessDigit1 == lotteryDigit3)
			System.out.println("Match all digits: you win $750");

		else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2
				|| guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3
				|| guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit2
				|| guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit3
				|| guessDigit2 == lotteryDigit2 && guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2 && guessDigit3 ==lotteryDigit3
				|| guessDigit3 == lotteryDigit3 && guessDigit1 == lotteryDigit2
				|| guessDigit3 == lotteryDigit3 && guessDigit2 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3
				|| guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit1
				|| guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1
				|| guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1
				|| guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1
				|| guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
			System.out.println("Match two digits: you win $500");

		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1
				|| guessDigit3 == lotteryDigit2)
			System.out.println("Match one digit: you win $250");
		else
			System.out.println("Sorry, no match");
	}

}
