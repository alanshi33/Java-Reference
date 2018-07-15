import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.print("Enter a string: ");
String s = input.nextLine();

int low = 0;

int high = s.length() -1;

boolean isPalindrome = true;

while (low < high ) {
	if (s.charAt(low) != s.charAt(high)) {
		isPalindrome = false;
		break;
	}	
		low++;
		high--;
	}
 if (isPalindrome)
	 System.out.println(s + " is a plaindrome");
 else
	 System.out.println(s + " is not a palindrome");

	}

}
