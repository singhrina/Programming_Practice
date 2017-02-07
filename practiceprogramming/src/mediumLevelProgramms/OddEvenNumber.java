package mediumLevelProgramms;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check even or odd");
		number = sc.nextInt();
		sc.close();

		if ((number & 1) == 0) {
			System.out.println(+number + " is Even number");
		} else {
			System.out.println(+number + " is Odd Number");
		}

	}
}
