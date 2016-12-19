package mediumLevelProgramms;

import java.util.Scanner;

public class EvenOddNo {
	// without boolean
	public static int chekcEvenOdd() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. : ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("given no. is even");

		} else {
			System.out.println("no. is odd");
			sc.close();

		}
		return num;

	}

	// with boolean
	public static void checkTheNumber() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. : ");
		num = sc.nextInt();
		boolean isOdd = true;
		if (num % 2 == 0) {
			isOdd = false;

		}
		if (isOdd) {
			System.out.println(num + " is odd number");
		}

		else {
			System.out.println(num + " is even number");
			sc.close();

		}

	}

	public static void main(String[] args) {

		// EvenOddNo.chekcEvevOdd();
		EvenOddNo.checkTheNumber();

	}

}
