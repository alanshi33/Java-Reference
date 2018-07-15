
public class FutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 1000;
		int year = 0;
		while (tuition < 2000) {
			tuition = tuition * 1.07;
			year++;
		}
		System.out.println("Tuition will be doubled in "+ year +" years");
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
