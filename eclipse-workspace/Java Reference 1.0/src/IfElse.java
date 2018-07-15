import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What was the percentage of your last test?");
		int percentage = in.nextInt();
		
		char grade;
				
		 if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 80) {
			grade = 'B';
		} else if (percentage >= 70) {
			grade = 'C';
		} else if (percentage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade:" + grade);
		
		}
	
	}
		

	




