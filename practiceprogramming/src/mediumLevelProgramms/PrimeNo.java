package mediumLevelProgramms;

import java.util.Scanner;

public class PrimeNo {

	public static int checkNo() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number  :");
		num = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {

			System.out.println(+ num +" is a prime number");
		} else {
			System.out.println(+ num +" is not a prime number");
		}
		return num;
	}

	// without boolean
	public static void checkPrime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		sc.close();
		int factors = 0;
		for (int i = 1; i <=num; i++) {

			if (num % i == 0)

				factors++;
		}

		if (factors == 2) {
			System.out.println(+ num +" is a prime number");
		} else {
			System.out.println(+ num +" is not a prime number");
		}
	}

	public static void main(String[] args) {
		// PrimeNo.checkNo();
		PrimeNo.checkPrime();
	}
}
