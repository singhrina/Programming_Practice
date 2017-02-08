package mediumLevelProgramms;

  //swaping no. without thired variable
public class SwapNo {
	public static void SwapNumbers() {
		int a = 5;
		int b = 3;

		a = a + b;// a=8
		b = a - b;// b=5
		a = a - b;// a=3

		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}
	public static void main(String[] args) {
		SwapNo.SwapNumbers();
	}

}
