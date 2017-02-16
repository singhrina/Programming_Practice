package mediumLevelProgramms;

import java.util.Scanner;

//import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		System.out.println(a+b);
		sc.close();
		
	}
}