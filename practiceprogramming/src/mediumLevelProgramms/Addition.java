package mediumLevelProgramms;

//import java.util.Scanner;

public class Addition {
	public static int sumOfTheNo(int a, int b) {

		int c;
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println(
		 * "enter the number for a: "); System.out.println(
		 * "enter the number for b: "); c= sc.nextInt(); sc.close();
		 */

		c = a + b;
		System.out.println("sum of th no. is : " + c);

		return c;
	}

	public static void main(String[] args) {
		Addition.sumOfTheNo(2, 3);
	}
}