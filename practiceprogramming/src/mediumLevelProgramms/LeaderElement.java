package mediumLevelProgramms;

public class LeaderElement {
	public void getLeaderElements(int a[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (a[i] <= a[j])
					break;
			}
			if (j == size)
				System.out.println(a[i] + "");
		}

	}

	public static void main(String[] args) {
		LeaderElement elements = new LeaderElement();
		int a[] = { 6, 9, 15, 1, 11, 3, 10 };
		int n = a.length;
		elements.getLeaderElements(a, n);

	}

}


