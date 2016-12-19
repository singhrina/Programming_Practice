package mediumLevelProgramms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse : ");
		int originalNo = sc.nextInt();
		sc.close();
		int reverseNo = 0;
		int remainder;

		while (originalNo != 0) {
			remainder = originalNo % 10;
			reverseNo = reverseNo * 10 + remainder;
			originalNo = originalNo / 10;
		}
		System.out.println("reversr of the number is : " + reverseNo);
	}

}
