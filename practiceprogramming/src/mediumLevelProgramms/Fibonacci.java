package mediumLevelProgramms;

import java.util.Scanner;

public class Fibonacci {
	// 0,1,1,2,3,5,8,12.....fibonacci series
	public static void main(String[] args) {
		
		int a=1;
	    int b= 1;
	    int c= 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	int n  = sc.nextInt();
	sc.close();
	System.out.print(" 1 1 ");
	
	while(c<=n)
	{
		c = a + b;
		System.out.print(c + " ");
		a= b;
		b = c;
		
	}
	

}
}