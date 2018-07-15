import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

			System.out.println("How much money do you need to retire?");
			double goal = in.nextDouble();
			
			System.out.println("How much money will you contribute each year?");
			double payment = in.nextDouble();
			 
			System.out.print("Interest rate in %: ");
			double interestRate = in.nextDouble();
			
			double balance = 0;
			int years = 0;
			
			while (balance < goal) {
				// x+=y same as  x=x+y
				balance += payment;
				double interest = balance * interestRate /100;
				balance += interest;
				// ++ is +1 to round
				years++;
				}
			System.out.println("You can retire in " + years + " years.");
	
	}

}
