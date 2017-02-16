package mediumLevelProgramms;

import java.util.Scanner;

public class PerfectNo {
	public static void checkPefrectNo() {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  no. to check :");
		n = sc.nextInt();
		sc.close();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("given no is perfect ");
		} else {
			System.out.println("given no is not perfact");
		}
	}

	int divisor(int x) {
		return x;
	}
	public static void main(String[] args) {
		PerfectNo.checkPefrectNo();
	}

}