
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("           Multiplication Table");

		System.out.print("    ");
		for (int j = 1; j<= 10000; j++)
			System.out.print("   " + j);

		System.out.println("\n-------------------------------------------------");

		for(int i = 1; i<=10000; i++) {
			System.out.print(i + "    | ");
			for(int j = 1; j<=10000; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}


	}

}
