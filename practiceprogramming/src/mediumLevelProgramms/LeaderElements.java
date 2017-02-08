package mediumLevelProgramms;

public class LeaderElements {

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
		LeaderElements elements = new LeaderElements();
		int a[] = { 14, 11, 2, 3 };
		int n = a.length;
		elements.getLeaderElements(a, n);

	}

}
