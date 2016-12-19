package mediumLevelProgramms;

import java.util.Scanner;

public class PingPong {
	public static int pingpong() {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		num = sc.nextInt();
		sc.close();

		if (num % 3 == 0 & num % 5 == 0) {
			System.out.println("pingpong");
		}

		else if (num % 3 == 0) {
			System.out.println("ping");
		}
		if (num % 5 == 0) {
			System.out.println("pong");

		}

		return num;
	}

	public static void main(String[] args) {
		PingPong.pingpong();
	}

}
