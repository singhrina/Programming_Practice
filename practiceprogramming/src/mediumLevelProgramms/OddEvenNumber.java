package mediumLevelProgramms;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
		num = sc.nextInt();
		sc.close();

		if ((num & 1) == 0) {
			System.out.println(+num + " is Even number");
		} else {
			System.out.println(+num + " is Odd Number");
		}

	}
}
