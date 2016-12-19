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
		for(int i=2;i<num;i++){
		if (i%num==0)
		{
			isPrime=false;
			break;}
		}
		if(isPrime){

			System.out.println("given no. is a prime number");
		} else {
			System.out.println("given no. is not a prime number");
		}
		return num;
		}
	

	public static void main(String[] args) {
PrimeNo.checkNo();
	}
}
