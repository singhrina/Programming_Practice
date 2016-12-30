package mediumLevelProgramms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		String original;
		 String reverse = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse :");
		original = sc.nextLine();
		sc.close();
		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("original string is :" + original);
		System.out.println("reverse string is :" + reverse);

	}
}
