import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.println("What is your current age?");
		int age = in.nextInt();
		
		System.out.println("Well, " + name + " in 3 years you will be " + (age +3));
	}

}
