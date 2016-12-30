package mediumLevelProgramms;

import java.util.Scanner;

public class NoPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no to check the palindrome :");
		int num = sc.nextInt();
		sc.close();
		int reverse = 0;

		while (num !=0) {
			reverse = reverse * 10;
			reverse = reverse + (num % 10);
			num = num / 10;

		}
		System.out.println(reverse);

		if (reverse== num) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
}}

